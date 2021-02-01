package Animal;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;




    public Dog(String names, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(names, 1, 1, weight, size);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat= coat;
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(12);
        walk(speed);
        run(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    public void walk(int speed){
        System.out.println("Dog.walk() called.");
        super.move(speed);
    }


    public void run(int speed){
        System.out.println("Dog.run() called.");
        super.move(speed);
    }
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void chew(){
        System.out.println("Dog.chew() called.");
}

}
