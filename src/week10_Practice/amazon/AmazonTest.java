package week10_Practice.amazon;

import week10_Practice.amazon.AmazonAccount;

public class AmazonTest {

    public static void main(String[] args) {


        AmazonAccount account1 = new AmazonAccount("javaschool", "java123@gmai.com", false);


        System.out.println(account1.getEmail());

        account1.setEmail("javajavatobe@gmail.com"); // change email

    }
}
