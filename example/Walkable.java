package org.example;

public interface Walkable {
    void walk(Animal animal);
    default void feedAnimal(Animal animal) {
            animal.setHungry(false);
            System.out.println("Animal " + animal.getName() + " is not hungry anymore");
        }
     default void feedAnimals(Animal... animals) {
            for (Animal a : animals) {
                feedAnimal(a);
            }
        }
}
