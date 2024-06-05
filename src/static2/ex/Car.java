package static2.ex;

public class Car {

    private String carName;
    private static int totalCars = 0;

    public Car(String carName) {
        System.out.println("차량 구입, 이름: " + carName);
        this.carName = carName;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구입한 총 차량 수 " + totalCars);
    }
}
