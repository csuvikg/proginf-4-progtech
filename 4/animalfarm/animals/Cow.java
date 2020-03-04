package animalfarm.animals;

import java.util.List;

class Cow extends Animal {
    Cow(String name, int weight, List<Integer> meals) {
        super(name, weight, meals);
    }

    @Override
    int getThreshold() {
        return 100;
    }
}
