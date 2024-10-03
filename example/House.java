package org.example;

public class House {
    public static void main(String[] args) {
        Creature cat = new Cat("Tom", 2);
        Creature dog = new Dog("Maks", 1);
        Creature human = new Human("Peter",47);
        Robot robi = new Robot("R2",97,"Ch07Bq2","Ver2.03");

        human.introduce((Animal) cat, (Animal) dog,robi, (Human) human);
        System.out.println("**************");
        robi.introduce((Animal) cat, (Animal) dog,robi, (Human) human);
        System.out.println("**************");
        cat.introduce((Animal) cat, (Animal) dog,robi, (Human) human);
        System.out.println("**************");
        dog.introduce((Animal) cat, (Animal) dog,robi, (Human) human);
        System.out.println("**************");
        ((Human) human).walk((Animal) cat);
        System.out.println("**************");
        ((Human) human).walk((Animal) dog);
        System.out.println("**************");
        ((Human) human).feedAnimals((Animal) cat, (Animal) dog);
        System.out.println("**************");
        robi.walk((Animal)cat);
        System.out.println("**************");
        robi.walk((Animal)dog);
        System.out.println("**************");
        robi.feedAnimals((Animal) cat, (Animal) dog);
        System.out.println("**************");
        ((Human) human).play(cat);
        ((Human) human).play(dog);
        ((Human) human).play(robi);
        System.out.println("**************");
        robi.play(cat);
        robi.play(dog);
        robi.play(human);
        System.out.println("**************");
         ((Cat) cat).play(dog);
         ((Dog) dog).play(cat);
         ((Cat) cat).play(robi);
         ((Dog) dog).play(robi);
        System.out.println("**************");
        ((Cat) cat).catchMouse(4);
        robi.catchMouse(6);
        System.out.println("**************");
        ((Cat) cat).muay();
        ((Dog) dog).bay();
        System.out.println("**************");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(human);
        System.out.println(robi);
    }
}
