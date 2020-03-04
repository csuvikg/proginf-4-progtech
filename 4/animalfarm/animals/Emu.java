package animalfarm.animals;

import java.util.List;

class Emu extends Animal {
    Emu(String name, int weight, List<Integer> meals) {
        super(name, weight, meals);
    }

    @Override
    int getThreshold() {
        return 20;
    }
}
