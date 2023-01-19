package codeclanTowers;

public class Bedroom extends Room {

    private final int roomNumber;
    private final RoomType type;
    private final int nightlyRate;

    public Bedroom (int roomNumber, RoomType type, int nightlyRate) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

//    public RoomType getType() {
//        return type;
//    }

    public int getNightlyRate() {
        return nightlyRate;
    }

}
