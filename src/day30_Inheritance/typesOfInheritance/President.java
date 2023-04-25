package day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {

    private LocalDate getElectedDay;

    public President(String name, char gender, LocalDate DOB, LocalDate getElectedDay) {
        super(name, gender, DOB);
        setGetElectedDay(getElectedDay);
    }

    public LocalDate getGetElectedDay() {
        return getElectedDay;
    }

    public void setGetElectedDay(LocalDate getElectedDay) {
        this.getElectedDay = getElectedDay;
    }

    public void lie(){
        System.out.println(getName() + " is lying");
    }
}
