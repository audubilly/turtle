package Animal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 25, 8);
        animal.eat();
        System.out.println("*****************************");

        Fish fish = new Fish(24,35,2,2);
//        fish.swim(12);
        fish.move(12);
        System.out.println("****************************");

        Dog dog = new Dog("Teddy", 34, 35, 2, 4, 1, 32, "Desert fur");

      dog.eat();
        System.out.println("*****************************");
      dog.sleep();
        System.out.println("*******************************");
       dog.walk(34);
        System.out.println("*******************************");
         dog.run(21);
        System.out.println("******************************");
        dog.move(12);
        System.out.println("*******************************");






    }

    }

