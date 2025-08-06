public class Smartphone implements IDevice {
    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public void turnOn() {
        System.out.println(model + " is now ON.");
    }
}
