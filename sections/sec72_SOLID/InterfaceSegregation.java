package sections.sec72_SOLID;

/*
    BAD IMPLEMENTATION:

    interface Worker {
        void work();
        void eat();
    }

    class Robot implements Worker {
        public void work() {
            System.out.println("Robot working");
        }

        public void eat() {
            throw new UnsupportedOperationException();  // Robot cannot eat!
        }
    }
*/

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.work();

        Robot robot = new Robot();
        robot.work();
    }
}
