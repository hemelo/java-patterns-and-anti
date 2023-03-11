package creational.demo.prototype;

public class PrototypeTypeThree implements Prototype {

    private String name = "ThirdVersion";

    @Override
    public Prototype clone() {
        return new PrototypeTypeThree();
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
