class PassengerBogie extends Bogie {

    PassengerBogie(String id, String type, int capacity) {
        super(id, type, capacity);
    }

    @Override
    void display() {
        System.out.println(id + " | " + type + " | Capacity: " + capacity);
    }
}