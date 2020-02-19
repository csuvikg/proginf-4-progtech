package animals;

public abstract class Pet extends Animal {
    @Override
    public void move() {
        System.out.println("Moves slowly");
    }
}
