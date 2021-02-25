package Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("SUV",456,700,1);
        RangeRover rangeRover = new RangeRover(425,"envogue","50 HSE");
        rangeRover.pushButtonToStart();
        System.out.println("********************");
        rangeRover.pushButtonToOff();
        System.out.println("**********************");
        rangeRover.move();
        System.out.println("***********************");
        rangeRover.increaseSpeed(25);
        System.out.println("*******************");

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
