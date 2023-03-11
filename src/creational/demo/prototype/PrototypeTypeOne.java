package creational.demo.prototype;

public class PrototypeTypeOne implements Prototype {

    private String name = "FirstVersion";

    @Override
    public Prototype clone() {
        return new PrototypeTypeOne();
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
