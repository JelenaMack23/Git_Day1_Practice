package week11_practice.discord;

public class Student extends DiscordUser{

    int loveForJava;

    public Student(String name, int id){
        super("student", name, id);
        this.loveForJava = loveForJava;
    }

    public void sendMessage(String name){
        System.out.println("Sending message to " +  name);
    }
}
