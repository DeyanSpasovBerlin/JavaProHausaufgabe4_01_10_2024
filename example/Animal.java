package org.example;

public class Animal extends Creature{
    public Animal(String name, Integer age) {
        super(name, age);
    }
    public void hungry(Animal animal){
        System.out.println("The animal "+animal.getName()+" is "+animal.getHungry());
    }

    @Override
    public void introduce(Animal cat, Animal dog, Robot robot, Human human) {

    }

    public void animalSay(){};
}
