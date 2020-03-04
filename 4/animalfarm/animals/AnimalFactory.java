package animalfarm.animals;

import java.util.List;

public class AnimalFactory {
    public static Animal create(AnimalType type, String name, int weight, List<Integer> meals) {
        switch (type) {
            case T:
                return new Cow(name, weight, meals);
            case L:
                return new Horse(name, weight, meals);
            case K:
                return new Goat(name, weight, meals);
            case E:
                return new Emu(name, weight, meals);
            default:
                throw new RuntimeException("Unknown animal provided");
        }
    }
}
