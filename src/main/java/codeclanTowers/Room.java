package codeclanTowers;

import java.util.ArrayList;

public abstract class Room {

    private final int capacity;
    private final ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (guests.size() + 1 <= capacity) {
            guests.add(guest);
        }
    }
}
