package day29_Inharitance.AnimalTask;

public class Dog extends Animal {  // Dog is An Animal
    //       child       Parent

 /*   public void method() {
        System.out.println(name);   // attributes of dog class now
       System.out.println(breed);
       System.out.println(gender);
       System.out.println(age);
       System.out.println(size);
       System.out.println(color);
       System.out.println(isAnimal);

       setInfo();
       eat();
       sleep();
       drink();

      */
        public void bark(){
            System.out.println(getName() + " is barking");
        }


    }
