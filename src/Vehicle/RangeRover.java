package Vehicle;

public class RangeRover extends  Car{

    private String model;
    private String colour;
    private String engine;


    public RangeRover(int size,String model, String engine) {
        super(size, "Matt Black");

        this.model = model;
        this.engine = engine;
    }

    public void pushButtonToStart(){
        System.out.println("Push Button to start Engine");
    }

    public void pushButtonToOff(){
        System.out.println("Push Button to off Engine");
    }

    @Override
    public void move() {
        pushButtonToStart();
        pushButtonToOff();
        increaseSpeed(12);
        super.move();
    }
}
