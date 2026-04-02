import java.util.*;

public class UseCase5 {
    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate
        train.add("Sleeper"); // will be ignored

        // Display train formation
        System.out.println("Train Formation (Insertion Order Maintained):");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
