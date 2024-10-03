package org.example;

public class Human extends Creature implements Walkable,Playable{


    public Human(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void feedAnimal(Animal animal) {
        animal.setHungry(false);
        System.out.println(this.getName()+" feed the animal " + animal.getName() + " and now "+ animal.getName() +" is not hungry anymore");
    }

    @Override
    public void introduce(Animal cat, Animal dog, Robot robot, Human human) {
        System.out.println(" I am "+human.getName()+". My age is "+human.getAge()+". And I am a owner of cat "+cat.getName()+", dog" +
                " "+dog.getName()+" and " +
                "a robot "+robot.getName()+" with ID "+robot.getId()+". My robot is version "+robot.getVersion());
    }


    @Override
    public void walk(Animal animal) {
        System.out.println(" I am "+this.getName()+" an I like to walk with "+animal.getName());
        animal.setHungry(true);
        animal.animalSay();
    }

    @Override
    public void play(Object object) {
        if(object.getClass() == Cat.class){
            System.out.println(" I am "+this.getName()+" An I love to play with cat "+((Cat) object).getName()+" " +
                    "becouse cats love to purr when petted! ");
        } else if (object.getClass() == Dog.class) {
            System.out.println(" I am "+this.getName()+" An I love to play with dog "+((Dog) object).getName()+" " +
                    "becouse dogs wag their tails when petted! ");
        }else {
            System.out.println(" I am "+this.getName()+" An I love to play with robot "+((Robot) object).getName()+" " +
                    "becouse when I reprogram the robot it becomes a higher version of "+((Robot) object).getId()+" !");
        }
    }
}
