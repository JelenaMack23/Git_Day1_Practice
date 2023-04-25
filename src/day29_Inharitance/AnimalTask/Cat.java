package day29_Inharitance.AnimalTask;

public class Cat extends Animal{

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }

}
