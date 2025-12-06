import java.util.HashMap;

public class Database {
    // Centralized data storage simulating database
    public static HashMap<String, Reservation> reservations = new HashMap<>();

    // Train number → Train name (Auto fill)
    public static HashMap<String, String> trainData = new HashMap<>();

    static {
        trainData.put("11009", "Sinhagad Express");
        trainData.put("12129", "Intercity Express");
        trainData.put("20123", "Deccan Queen");
    }
}
