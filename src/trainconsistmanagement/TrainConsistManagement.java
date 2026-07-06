package trainconsistmanagement;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {
    public static void main(String[] args) {

        // Display header banner
        System.out.println("==========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train    ");
        System.out.println("==========================================\n");

        // Initialize an empty ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 1. Add Bogies (Create/Insert)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 2. Remove Bogie (Delete/Detach)
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. Check Existence (Search/Inspect)
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // 4. Print Final Consist State
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}

