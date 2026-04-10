import java.util.*;
import java.util.stream.Collectors;

public class UseCase9 {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("B1", "Sleeper", 72));
        bogies.add(new PassengerBogie("B2", "AC Chair", 60));
        bogies.add(new PassengerBogie("B3", "First Class", 50));
        bogies.add(new PassengerBogie("B4", "Sleeper", 80));

        // Grouping by type
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display
        System.out.println("Grouped Bogies:");
        for (String key : grouped.keySet()) {
            System.out.println(key + ":");
            for (Bogie b : grouped.get(key)) {
                b.display();
            }
        }
    }
}