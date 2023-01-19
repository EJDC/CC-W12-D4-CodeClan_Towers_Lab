package codeclanTowers;

import java.util.ArrayList;

public abstract class Room {

    private final int capacity;
    private final ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public static int calculateSize(int width, int length) {
        return width * length;
    }

    public void checkin(ArrayList<Guest> guests) {
        if (this.getNumberOfGuests() > 0) return;
        if (this.getCapacity() < guests.size()) {
            return;
        }
        for (Guest guest : guests) {
            this.addGuest(guest);
        }
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

    public void vacate() {
        this.guests.clear();
    }
}