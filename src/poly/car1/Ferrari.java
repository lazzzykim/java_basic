package poly.car1;

public class Ferrari implements Car {

    @Override
    public void startEngine() {
        System.out.println("Ferrari.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Ferrari.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Ferrari.pressAccelerator");
    }
}
