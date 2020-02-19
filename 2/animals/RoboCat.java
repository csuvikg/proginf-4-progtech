package animals;

public class RoboCat extends Cat implements Robot {
    @Override
    public void cleans() {
        System.out.println("Cleans up the place");
    }

    @Override
    public void makeSound() {
        System.out.println("Meows in a robotic way");
    }
}
