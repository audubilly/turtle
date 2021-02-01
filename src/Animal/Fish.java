package Animal;

public class Fish  extends Animal{

    private int gills;
    private int eyes;
    private  int fins;

    public Fish( int size, int gills, int eyes, int fins) {
        super("Fish",1,1, 25, size);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    public void rest(){

    }

   private void moveMuscles(){

   }
   private void moveBackFin(){

   }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
        System.out.println("Fish.swim() called.");
    }
}
