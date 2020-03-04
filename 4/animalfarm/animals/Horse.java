package animalfarm.animals;

import java.util.List;

class Horse extends Animal {
    Horse(String name, int weight, List<Integer> meals) {
        super(name, weight, meals);
    }

    @Override
    int getThreashold() {
        return 60;
    }
}
