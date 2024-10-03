package org.example;

public class Robot extends Creature implements Walkable,Playable,CatchingSkills{
    private String id;
    private String version;

    public Robot(String name, Integer age,String id,String version) {
        super(name, age);
        this.id = id;
        this.version = version;
    }

    @Override
    public void feedAnimal(Animal animal) {
        Walkable.super.feedAnimal(animal);
        animal.setHungry(false);
        System.out.println(this.getName()+" feed the animal " + animal.getName() + " and now "+ animal.getName() +" is not hungry anymore");
    }



    @Override
    public void introduce(Animal cat, Animal dog, Robot robot, Human human) {
        System.out.println(" I am a robot "+robot.getName()+".I am "+robot.getAge()+" year old. My id number is:"+robot.getId()+" an I have BIOS " +
                "version: " +robot.getVersion()+ " My owner is "+human.getName()+ ".I an cary for cat "+cat.getName()+
                " and dog "+dog.getName()+". I love when "+human.getName()+" changed my hydraulic oil and changed my " +
                "bios to a higher version than "+robot.getVersion());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public void walk(Animal animal) {
        System.out.println(" I am a robot "+this.getName()+" and I am programing to walk with "+animal.getName());
        animal.setHungry(true);
        animal.animalSay();
    }

    @Override
    public void play(Object object) {
        if(object.getClass() == Cat.class){
            System.out.println(" I am robot "+this.getName()+". My version is: "+this.getVersion()+"And I love to " +
                            "play with cat "+((Cat) object).getName()+
                            " " +
                    "becouse cats love to purr when petted! ");
        } else if (object.getClass() == Dog.class) {
            System.out.println(" I am robot "+this.getName()+". My version is: "+this.getVersion()+" An I love to play with dog "+
                    ((Dog) object).getName()+" " +
                    "becouse dogs wag their tails when petted! ");
        }else if(object.getClass() == Human.class){
            System.out.println(" I am robot "+this.getName()+". My version is: "+this.getVersion()+" and I love when"+((Human) object).getName()+
                    "play with me becouse he changes my hydraulic oil and upgrade my BIOS version from "+this.getVersion()+" to hier version!");
        }
    }

    @Override
    public void catchMouse(Integer numberMouse) {
        System.out.println(" I am a robot"+this.getName()+".My ID is "+this.getId()+" and my version is "+this.getVersion()+"I " +
                "have a " + "laser motion detector and today  I detected movement of "+numberMouse+
                " mause. I have a 2 Kilowatt laser and shot "+numberMouse+" mice today.");
    }
}
