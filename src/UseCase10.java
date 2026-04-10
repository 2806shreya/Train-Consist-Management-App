import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}

public class UseCase10 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from UC7/UC8/UC9)
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40),
                new Bogie("Sleeper", 80)
        );

        // Step 2 + 3 + 4: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // Extract capacity
                .reduce(0, Integer::sum);      // Sum all values

        // Step 5: Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}