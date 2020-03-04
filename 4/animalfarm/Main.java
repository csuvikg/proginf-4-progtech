package animalfarm;

import animalfarm.animals.Animal;
import animalfarm.animals.AnimalFactory;
import animalfarm.animals.AnimalType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Animal> underweight = new ArrayList<>();
        List<Animal> overeater = new ArrayList<>();

        Files.lines(Paths.get("4/animalfarm/test"))
                .skip(1)
                .map(line -> line.split(" "))
                .map(Arrays::asList)
                .map(parts -> {
                    AnimalType type = AnimalType.valueOf(parts.get(0));
                    String name = parts.get(1);
                    int weight = Integer.parseInt(parts.get(2));
                    List<Integer> meals = parts.subList(4, parts.size()).stream()
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());

                    return AnimalFactory.create(type, name, weight, meals);
                })
                .forEach(animal -> {
                    if (animal.isUnderweight()) underweight.add(animal);
                    if (animal.isOvereater()) overeater.add(animal);
                });

        System.out.println(underweight);
        System.out.println(overeater);
    }
}
