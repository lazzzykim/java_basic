package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3car = new K3Car();

        driver.setK3Car(k3car);
        driver.drive();

        // 추가
        Model3 model3 = new Model3();
        driver.setK3Car(null);
        driver.setModel3(model3);
        driver.drive();
    }
}
