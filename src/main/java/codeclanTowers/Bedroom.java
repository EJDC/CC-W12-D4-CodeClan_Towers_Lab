package codeclanTowers;

public class Bedroom extends Room {

    private final int roomNumber;
    private final RoomType type;

    public Bedroom (int roomNumber, RoomType type) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }
}
