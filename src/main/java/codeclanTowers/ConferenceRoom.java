package codeclanTowers;

public class ConferenceRoom extends Room {

    private final String name;

    public ConferenceRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
