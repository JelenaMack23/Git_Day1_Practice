package week10_Practice.drink;

import week10_Practice.drink.Drink;

import java.util.ArrayList;

public class DrinkVending {


    ArrayList<Drink> allDrinks;

    public DrinkVending(){
        allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks){
        this();  // calls the no arg constructor
        allDrinks.addAll(inputDrinks); // add al of the Drinks objects from the inputDrinks into the instance allDrinks Arraylist
    }

    public void stock(ArrayList<Drink> newDrinks){

        for (Drink each : newDrinks){  // each is the new drinks

            for (Drink vending : allDrinks){
                if(vending.name.equalsIgnoreCase(each.name)){
                    vending.quantity += each.quantity;
                    break;
                }
            }


        }
    }

    public String toString(){
        String output = "";
        for(Drink each : allDrinks){
            output += each + "\n";
        }
        return output;
    }

}
 /*
    Create a DrinkVending class:
        create a instance variable: allDrinks (ArrayList of Drink objects)
        create a constructor that will create an empty ArrayList
        create an overloaded constructor that will accept a ArrayList of Drinks of objects to initialize the vending machine with some Drinks
        create a toString to display the drinks in a nice format
     */