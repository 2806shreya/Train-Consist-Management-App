import java.util.*;

// Base class
abstract class Bogie {
    String id;

    Bogie(String id) {
        this.id = id;
    }

    abstract void display();
}

// Passenger Bogie
class PassengerBogie extends Bogie {
    String type;
    int capacity;

    PassengerBogie(String id, String type, int capacity) {
        super(id);
        this.type = type;
        this.capacity = capacity;
    }

    int getCapacity() {
        return capacity;
    }

    void display() {
        System.out.println("Passenger Bogie: " + id +
                " | Type: " + type +
                " | Capacity: " + capacity);
    }
}

// Goods Bogie
class GoodsBogie extends Bogie {
    String shape;
    String cargoType;

    GoodsBogie(String id, String shape, String cargoType) {
        super(id);
        this.shape = shape;
        this.cargoType = cargoType;
    }

    String getCargoType() {
        return cargoType;
    }

    void display() {
        System.out.println("Goods Bogie: " + id +
                " | Shape: " + shape +
                " | Cargo: " + cargoType);
    }
}

// Train class
class Train {
    String name;
    List<Bogie> bogies = new ArrayList<>();

    Train(String name) {
        this.name = name;
    }

    void addBogie(Bogie b) {
        bogies.add(b);
    }

    void displaySummary() {
        int totalCapacity = 0;
        Set<String> cargoTypes = new HashSet<>();

        System.out.println("\nTrain: " + name);
        System.out.println("----- Consist -----");

        for (Bogie b : bogies) {
            b.display();

            if (b instanceof PassengerBogie) {
                totalCapacity += ((PassengerBogie) b).getCapacity();
            } else if (b instanceof GoodsBogie) {
                cargoTypes.add(((GoodsBogie) b).getCargoType());
            }
        }

        System.out.println("\nTotal Bogies: " + bogies.size());
        System.out.println("Total Passenger Capacity: " + totalCapacity);
        System.out.println("Cargo Types: " + cargoTypes);
    }
}

// Main class
public class UseCase1 {
    public static void main(String[] args) {

        Train train = new Train("Express 101");

        // Passenger bogies
        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 50));

        // Goods bogies
        train.addBogie(new GoodsBogie("G1", "Rectangular", "Coal"));
        train.addBogie(new GoodsBogie("G2", "Cylindrical", "Oil"));

        // Display summary
        train.displaySummary();
    }
}
