package animalfarm.animals;

import java.util.List;

class Goat extends Animal {
    Goat(String name, int weight, List<Integer> meals) {
        super(name, weight, meals);
    }

    @Override
    int getThreshold() {
        return 12;
    }
}
