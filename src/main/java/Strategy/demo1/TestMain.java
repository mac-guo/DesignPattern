package Strategy.demo1;

public class TestMain {
    public static void main(String[] args) {
        Car blackCar = new LittleCar();
        blackCar.color.getColor();
        blackCar.speed.getSpeed();
        blackCar.didi();
        blackCar.drive();

        Car redCar = new FireCar();
        redCar.color.getColor();
        redCar.speed.getSpeed();
        redCar.didi();
        redCar.drive();
    }
}
