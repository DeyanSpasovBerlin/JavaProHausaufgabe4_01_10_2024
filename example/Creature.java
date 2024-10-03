package org.example;

public abstract class Creature {
private String name;
private Integer age;
public Boolean isHungry = true;

    public Creature(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getHungry() {
        return isHungry;
    }

    public void setHungry(Boolean hungry) {
        isHungry = hungry;
        //return isHungry;
    }


    @Override
    public String toString() {
        return "I am "+this.name+" and I am "+this.getAge()+" years old.";
    }

    public abstract void introduce(Animal cat, Animal dog, Robot robot,Human human);


}
