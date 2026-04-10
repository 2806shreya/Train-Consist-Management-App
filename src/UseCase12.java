import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class UseCase12 {

    public static void main(String[] args) {

        // Step 1: Create goods bogie list
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        // Step 2: Stream + allMatch() safety validation
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // other bogies allowed any cargo
                });

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}
