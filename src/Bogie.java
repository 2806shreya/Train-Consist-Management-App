abstract class Bogie {
    String id;
    String type;
    int capacity;

    Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    String getType() {
        return type;
    }

    abstract void display();
}}
