package codeclanTowers;

import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Bedroom> bedrooms;
    private final ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkin(ArrayList<Guest> guests, int roomNumber) {
        Bedroom foundBedroom = null;
        for (Bedroom currentBedroom : this.bedrooms) {
            if (currentBedroom.getRoomNumber() == roomNumber) {
                foundBedroom = currentBedroom;
                break;
            }
        }
        if (foundBedroom == null) {
            return;
        }
        if (foundBedroom.getCapacity() < guests.size()) {
            return;
        }
        for (Guest guest : guests) {
            foundBedroom.addGuest(guest);
        }
    }
}
