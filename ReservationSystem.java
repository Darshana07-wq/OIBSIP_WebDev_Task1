import java.util.Scanner;
import java.util.UUID;

public class ReservationSystem {

    private Scanner sc;

    public ReservationSystem(Scanner sc) {
        this.sc = sc;
    }

    // MAKE A RESERVATION
    public void makeReservation() {
        System.out.println("\n===== MAKE RESERVATION =====");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNo = sc.nextLine();

        String trainName = Database.trainData.getOrDefault(trainNo, "Unknown Train");
        System.out.println("Train Name: " + trainName);

        System.out.print("From (Place): ");
        String from = sc.nextLine();

        System.out.print("To (Destination): ");
        String to = sc.nextLine();

        System.out.print("Date of Journey (DD/MM/YYYY): ");
        String date = sc.nextLine();

        System.out.print("Enter Class (Sleeper/AC/General): ");
        String classType = sc.nextLine();

        String pnr = UUID.randomUUID().toString().substring(0, 8);

        Reservation r = new Reservation(pnr, name, trainNo, trainName, from, to, date, classType);
        Database.reservations.put(pnr, r);

        System.out.println("\n✔ Reservation Successful!");
        System.out.println("Your PNR: " + pnr);
    }

    // CANCEL RESERVATION
    public void cancelReservation() {
        System.out.println("\n===== CANCEL RESERVATION =====");
        System.out.print("Enter PNR to Cancel: ");

        String pnr = sc.nextLine();

        if (Database.reservations.containsKey(pnr)) {
            Reservation r = Database.reservations.get(pnr);
            r.showDetails();

            System.out.print("Confirm Cancellation? (yes/no): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                Database.reservations.remove(pnr);
                System.out.println("✔ Reservation Cancelled Successfully!");
            } else {
                System.out.println("❌ Cancellation Aborted.");
            }
        } else {
            System.out.println("❌ Invalid PNR!");
        }
    }

    // VIEW ALL RESERVATIONS
    public void viewAllReservations() {
        System.out.println("\n===== ALL RESERVATIONS =====");

        if (Database.reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        for (Reservation r : Database.reservations.values()) {
            r.showDetails();
            System.out.println("-----------------------------------");
        }
    }
}
