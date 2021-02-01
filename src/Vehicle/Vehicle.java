package Vehicle;

public class Vehicle {

    private String name;
    private int weight;
    private int size;
    private int engine;

    public Vehicle(String name, int weight, int size, int engine) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.engine = engine;
    }

    public void move(){
        System.out.println("Vehicle.move Called");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
