import java.util.Scanner;

public class Login {

    private static final String VALID_USER = "Admin";
    private static final String VALID_PASS = "1234";

    public static boolean authenticate(Scanner sc) {
        System.out.print("Enter Login ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        return id.equals(VALID_USER) && pass.equals(VALID_PASS);
    }
}
