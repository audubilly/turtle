package MoviePolymorphism;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return ("No plot here");

    }

    public String getName() {
        return name;
    }

}

class JAWS extends Movie {

        public JAWS() {
            super("Jaws");
        }


        public String plot() {
            return "A shark eats lots of people";

        }
    }

    class IndependenceDay extends Movie {
        public IndependenceDay(){
            super("IndependenceDay");
        }

        @Override
        public String plot() {
            return "Alien attempt to take over Earth";
        }

    }

    class MazeRunner extends Movie {
        public MazeRunner() {
            super("MazeRunner");
        }

        @Override
        public String plot() {
            return "kids trying to escape a maze.";
        }
    }


    class StarWars extends Movie {
        public StarWars() {
            super("Star Wars");
        }

        @Override
        public String plot() {
            return "Imperial Forces try to take over the universe ";
        }
    }

    class Forgettable extends Movie {
        public Forgettable() {
            super("Forgettable");
        }

    }





    class Main {

        public static void main(String[] args) {

            for (int i = 0; i < 11; i++) {
                Movie movie = randomMovie();
                System.out.println("movie #" + i + ":" + movie.getName() + "\n" + "plot:" + movie.plot() + "\n");
            }
        }

        public static Movie randomMovie() {
            int randomNumber = (int) (Math.random() * 5) + 1;
            System.out.println("Random number generated was " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new JAWS();

                case 2:
                    return new IndependenceDay();

                case 3:
                    return new MazeRunner();

                case 4:
                    return new StarWars();

                case 5:
                    return new Forgettable();

                default:
                    return null;
            }
        }

    }







