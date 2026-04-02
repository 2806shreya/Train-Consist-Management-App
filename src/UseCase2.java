import java.util.*;

// Passenger Bogie class
class PassengerBogie {
    String id;
    String type;
    int capacity;

    PassengerBogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("ID: " + id +
                " | Type: " + type +
                " | Capacity: " + capacity);
    }
}

// Train class
class Train {
    List<PassengerBogie> bogies = new ArrayList<>();

    // Add bogie
    void addBogie(PassengerBogie b) {
        bogies.add(b);
        System.out.println("Bogie " + b.id + " added.");
    }

    // Remove bogie by ID
    void removeBogie(String id) {
        boolean found = false;

        for (PassengerBogie b : bogies) {
            if (b.id.equals(id)) {
                bogies.remove(b);
                System.out.println("Bogie " + id + " removed.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found.");
        }
    }

    // Check if bogie exists
    void checkBogie(String id) {
        for (PassengerBogie b : bogies) {
            if (b.id.equals(id)) {
                System.out.println("Bogie " + id + " exists.");
                return;
            }
        }
        System.out.println("Bogie " + id + " does NOT exist.");
    }

    // Display all bogies
    void displayAll() {
        System.out.println("\n--- Passenger Bogies ---");
        for (PassengerBogie b : bogies) {
            b.display();
        }
    }
}

// Main class
public class UseCase2 {
    public static void main(String[] args) {

        Train train = new Train();

        // Adding bogies
        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 50));
        train.addBogie(new PassengerBogie("P3", "First Class", 30));

        // Display
        train.displayAll();

        // Check bogie
        train.checkBogie("P2");

        // Remove bogie
        train.removeBogie("P2");

        // Check again
        train.checkBogie("P2");

        // Final list
        train.displayAll();
    }
}