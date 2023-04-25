package week04package;

public class SMSParts {

    public static void main(String[] args) {

        String msg = "Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";

        int senderStarts = msg.indexOf("<") + 1;
        int senderEnd = msg.indexOf(">");

        int numberStarts = msg.indexOf("[");
        int numberEnds = msg.indexOf("]");

        System.out.println("Sender: " + msg.substring(senderStarts, senderEnd));
        System.out.println("Number: " + msg.substring(numberStarts + 1, numberEnds));
        System.out.println("Message: " + msg.substring(msg.indexOf("{") + 1, msg.indexOf("}")));








        /*    SmsParts [substring, indexOf]

    Create a program that will has a message String in this exact format:

        Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

    The content of name, number and message can vary, so based on the format extract those parts and output them.

    Ex:
    Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

    Output:
        Sender: Omer Karahan
        Number: 202-123-3456
        Message: I love programming and problem solving
     */
    }
}
