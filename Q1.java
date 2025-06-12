abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars through the skies.");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguin can't fly, but it sure can waddle.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly();
    }
}
