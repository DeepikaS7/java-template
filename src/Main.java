import java.util.Scanner;

public class Main {

    static String[] goodbyes = {"bye"}; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Hello! Welcome to Chick-Fil-A. How can I help you today?");
        String userResponse = scanner.nextLine();

        System.out.println("Would you like to know about our menu, hours, catering or our most popular food items?");
        String user2Response = scanner.nextLine();

        String response = getResponse(user2Response);
        System.out.println(response);
    }

    public static String getResponse(String statement) {
        String response = "";

        if (statement.indexOf("menu") >= 0) {
            response = "Our menu includes many things. We sell breakfast, sandwiches, entrees, sides, and even desserts. Would you like to know about anything more specifically?";
        } else if (statement.toLowerCase().indexOf("sandwich") >= 
                || statement.indexOf("Sides") >= 0
                || statement.indexOf("sandwiches") >= 0) {
            response = "We sell many different sandwiches, some include our Chicken Sandwich, Spicy Chicken Sandwich, our Chicken Deluxe Sandwich too. Is there anything else that I could help you with?";
        } else if (statement.toLowerCase().indexOf("dessert") >= 0  // Use toLowerCase() for case-insensitive matching
                || statement.indexOf("sweets") >= 0) {
            response = "We sell many different Desserts";
        } else {
            response = "I'm sorry, I didn't quite understand that. Would you like to know about our menu, hours, or our most popular food items?";
        }
        return response;
    }
}