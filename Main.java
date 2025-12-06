import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        // LOGIN SECTION
        if (!Login.authenticate(sc)) {
            System.out.println("Invalid Login! Access Denied.");
            return;
        }

        System.out.println("Login Successful!");

        ReservationSystem system = new ReservationSystem(sc);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Make Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. View All Reservations");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    system.makeReservation();
                    break;
                case 2:
                    system.cancelReservation();
                    break;
                case 3:
                    system.viewAllReservations();
                    break;
                case 4:
                    System.out.println("Thank you for using the Online Reservation System!");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
