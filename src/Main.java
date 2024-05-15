import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {

       users.put("admin", "password");

       Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter username : ");
        String username = scanner.nextLine();

        System.out.println("Please enter password : ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Authorized user detected");
        } else {
            System.out.println("Unauthorized user");
        }
    }

    public static boolean authenticate(String username, String password) {
        // Check username and password
        return users.containsKey(username) && users.get(username).equals(password);
    }
}