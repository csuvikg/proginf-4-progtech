package animalfarm.animals;

import java.util.List;

public abstract class Animal {
    private String name;
    private int weight;
    private List<Integer> meals;

    Animal(String name, int weight, List<Integer> meals) {
        this.name = name;
        this.weight = weight;
        this.meals = meals;
    }

    public boolean isUnderweight() {
        return weight < getThreashold();
    }

    public boolean isOvereater() {
        return meals.stream().reduce(0, Integer::sum) > 100;
    }

    abstract int getThreashold();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
