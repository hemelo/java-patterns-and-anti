package creational.demo.abstractfactory.cpu;

class EmberToolkit extends Factory {
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
