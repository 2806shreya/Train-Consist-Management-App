import java.util.*;
import java.util.stream.*;

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class UseCase13 {

    public static void main(String[] args) {

        // Step 1: Create large dataset
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new PassengerBogie("Sleeper", (i % 100) + 1));
        }

        // ---------------- LOOP APPROACH ----------------
        long startLoop = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM APPROACH ----------------
        long startStream = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}