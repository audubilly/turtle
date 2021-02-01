package Animal;

public class Animal {

    private String names;
    private int brain;
    private int body;
    private int weight;
    private int size;

    public void eat(){
        System.out.println("Animal.eat() called.");
    }

    public  void sleep(){
        System.out.println("Animal.sleep() called.");

    }

    public void move(int speed){
        System.out.println("Animal is moving at speed:" + speed);
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
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

    public Animal(String names, int brain, int body, int weight, int size) {
        this.names = names;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;





    }
}