import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (isGreeting(userInput)) {
                System.out.println("Hello! How can I help you today?");
            } else if (userInput.contains("menu")) {
                System.out.println("Our menu includes: sandwiches, salads, sides, desserts, drinks and more.");
            } else if (userInput.contains("food") || userInput.contains("items")) {
                System.out.println("We offer a variety of delicious food, they are sandwiches, salads, sides, desserts, drinks and more.");
            } else if (userInput.contains("hours")) {
                System.out.println("Our hours are: Monday through Friday 11:00 AM - 9:00 PM, Saturday-Sunday 10:00 AM - 10:00 PM depending on location.");
            } else {
                System.out.println("I'm not sure I understand. Can you please rephrase your question?");
            }
        }
    }

    public static boolean isGreeting(String message) {
        return message.contains("hi") || message.contains("hello") || message.contains("Hello") || message.contains("Hi") || message.contains("hey") || message.contains("HEY");
    }
}