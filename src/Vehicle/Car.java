package Vehicle;

public class Car extends Vehicle{

    private String name;
    private String colour;
    private int size;
    private String engine;

    public Car(int size,String colour) {
        super("RangeRover", 450, size,1);
        this.colour = colour;
        this.size = size;

    }

    public void changeGears(int speed){
        System.out.println("Changing gears Called" + speed);
    }

    public void increaseSpeed(int speed){
        System.out.println("increased speed by :" + speed);
    }

    public void drive(){
        changeGears(21);
        super.move();

    }


    @Override
    public void move() {
        drive();
        super.move();
    }
}
