package org.example;

public class Cat extends Animal implements Playable,CatchingSkills{

    public Cat(String name, Integer age) {
        super(name, age);
    }
    public void muay(){
        System.out.println("I am cat "+this.getName()+" And becouse I am hunhry  "+this.getHungry()+"  I say: " +
                "Muayyyyy!");
    }

    @Override
    public void animalSay() {
        super.animalSay();
        this.setHungry(true);
        System.out.println("And becouse I take a wolk now  "+this.getName()+" is hungry: "+isHungry+
                " and I say: Muayyyyy!");
    }

    @Override
    public void hungry(Animal animal) {
        super.hungry(animal);
        muay();
    }

    @Override
    public void introduce(Animal cat, Animal dog, Robot robot, Human human) {
        super.introduce(cat, dog, robot, human);
        System.out.println(" I am a cat "+cat.getName()+".I am "+cat.getAge()+" year old. My owner is "+human.getName()+
                ".My frend is "+dog.getName()+". For me care "+robot.getName()+". And normaly I am hungry "+cat.getHungry());
    }

    @Override
    public void play(Object object) {
        if(object.getClass() == Dog.class){
            System.out.println(" I am cat "+this.getName()+". I am "+this.getAge()+" year old. And I don't love to " +
                    "play with dog "+((Dog) object).getName()+
                    "he's chasing me and I have to run!!! ");
        } else if (object.getClass() == Robot.class) {
            System.out.println(" I am dog "+this.getName()+". I am "+this.getAge()+" year old. Anа I love to play " +
                    "with robot "+ ((Robot) object).getName()+" " +((Robot) object).getId()+
                    "because it smells like butter and squeaks when it walks!!!! ");
        }else {
            System.out.println(" I am dog "+this.getName()+". I am "+this.getAge()+" year old. An I love to " +
                    "play with my owner "+((Human)object).getName()+" " +
                    "because he throws me a stick, which I bring back!!!");
        }
    }

    @Override
    public void catchMouse(Integer numberMouse) {
        System.out.println("I am cat "+this.getName()+" I have acute hearing and heard "+(numberMouse+2)+"  mice today and caught " + numberMouse +
                " of them!");
    }
}
