package week11_practice.discord;

import java.time.LocalDate;

public class DiscordUser {

    String role;
    String name;
    int id;
    LocalDate createDate;


    public DiscordUser(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
        createDate = LocalDate.now();
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

    public void joinDiscord(String discordUrl){
        System.out.println("Joining " + discordUrl);
    }

    public static void launch(){
        System.out.println("Connecting to server");
    }

    @Override
    public String toString() {
        return name + "#" + id + "\nRoles: " + role + "\nAccount Created: " + createDate;
    }
}
