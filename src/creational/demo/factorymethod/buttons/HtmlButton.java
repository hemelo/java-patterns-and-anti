package creational.demo.factorymethod.buttons;

public class HtmlButton implements Button {


    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("alert('Test')");
    }
}
