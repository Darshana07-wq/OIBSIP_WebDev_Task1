public class Reservation {
    public String pnr;
    public String name;
    public String trainNumber;
    public String trainName;
    public String from;
    public String to;
    public String date;
    public String classType;

    public Reservation(String pnr, String name, String trainNumber, String trainName,
                       String from, String to, String date, String classType) {
        this.pnr = pnr;
        this.name = name;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.from = from;
        this.to = to;
        this.date = date;
        this.classType = classType;
    }

    public void showDetails() {
        System.out.println("\n===== RESERVATION DETAILS =====");
        System.out.println("PNR: " + pnr);
        System.out.println("Passenger Name: " + name);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Journey Date: " + date);
        System.out.println("Class: " + classType);
    }
}
