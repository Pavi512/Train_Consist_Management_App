package trainconsistmanagement;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class TrainConsistManagement {

    // Passenger Bogie
    static class PassengerBogie {
        String name;
        int capacity;

        public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Can't create bogie, Capacity must be greater than zero.");
            }

            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Created Bogie: " + name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==================================================\n");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println(sleeper);

            // Invalid bogie
            PassengerBogie acChair = new PassengerBogie("AC Chair", -10);
            System.out.println(acChair);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nUC14 custom exception handled.");
    }
}