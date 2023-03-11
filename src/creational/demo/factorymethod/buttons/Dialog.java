package creational.demo.factorymethod.buttons;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}
