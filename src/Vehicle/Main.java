package Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("SUV",456,700,1);

        Car car = new Car(234,"Black");
        car.drive();
        System.out.println("******************");
        car.increaseSpeed(21);
        System.out.println("*******************");
       car.changeGears(21);
       System.out.println("*********************");
        car.increaseSpeed(21);
        System.out.println("**************");
        vehicle.move();
        System.out.println("******************");

    }
}
