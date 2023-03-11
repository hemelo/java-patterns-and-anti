package creational.demo.prototype;

public class PrototypeTypeTwo implements Prototype {
    private String name = "SecondVersion";

    @Override
    public Prototype clone() {
        return new PrototypeTypeTwo();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        // TODO
    }
}
