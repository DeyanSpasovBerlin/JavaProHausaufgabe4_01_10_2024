package org.example;

public class Dog extends Animal implements Playable{


    public Dog(String name, Integer age) {
        super(name, age);
    }

    public void bay(){
        System.out.println("I am dog "+this.getName()+" And becouse I am hungry "+this.getHungry()+" I say: Bayyyyy!");
    }


    @Override
    public void animalSay() {
        super.animalSay();
        this.setHungry(true);
        System.out.println("And becouse I take a wolk now  "+this.getName()+" is hungry: "+isHungry+
                " and I say: Bayyyyy!");
    }

    @Override
    public void hungry(Animal animal) {
        super.hungry(animal);
        bay();

    }

    @Override
    public void introduce(Animal cat, Animal dog, Robot robot, Human human) {
        super.introduce(cat, dog, robot, human);
        System.out.println(" I am a dog "+dog.getName()+".I am "+dog.getAge()+" year old. My owner is "+human.getName()+
                ".My frend is "+cat.getName()+". For me care "+robot.getName()+". And normaly I am hungry "+dog.getHungry());
    }

    @Override
    public void play(Object object) {
        if(object.getClass() == Cat.class){
            System.out.println(" I am dog "+this.getName()+". I am "+this.getAge()+" year old. And I love to " +
                    "play with cat "+((Cat) object).getName()+
                    "I can chase her and bark after her!! ");
        } else if (object.getClass() == Robot.class) {
            System.out.println(" I am dog "+this.getName()+". I am "+this.getAge()+" year old. Anа I love to play " +
                    "with robot "+ ((Robot) object).getName()+" " +((Robot) object).getId()+
                    "because it's made of tin and I can bite him!! ");
        }else {
            System.out.println(" I am dog "+this.getName()+". I am "+this.getAge()+" year old. An I love to " +
                    "play with my owner "+((Human)object).getName()+" " +
                    "because he throws me a stick, which I bring back!!!");
        }
    }
}
