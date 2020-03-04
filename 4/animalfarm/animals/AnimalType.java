package animalfarm.animals;

public enum AnimalType {
    T(100), // cow
    L(60), // horse
    K(12), // goat
    E(20); // emu

    final int k;

    AnimalType(int k) {
        this.k = k;
    }
}
