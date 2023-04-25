package week11_practice.discord;

public class Admin extends DiscordUser{

    public Admin(String name, int id){
        super("Admin", name, id);
    }

    public void creatChannel(){
        System.out.println("Creating new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }

    public void sendMessage(String channel){
        System.out.println("Sending message to " + channel);
    }
}
