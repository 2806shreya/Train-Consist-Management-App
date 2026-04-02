import java.util.*;

public class UseCase4 {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies (order matters)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final train consist
        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
