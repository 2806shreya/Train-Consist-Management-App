import java.util.*;

public class UseCase3 {
    public static void main(String[] args) {

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display all bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}
