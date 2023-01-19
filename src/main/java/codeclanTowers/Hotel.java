package codeclanTowers;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private final ArrayList<Bedroom> bedrooms;
    private final HashMap<String, ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = new HashMap<>();
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            this.conferenceRooms.put(conferenceRoom.getName(), conferenceRoom);
        }
    }

//    public ArrayList<Bedroom> getBedrooms() {
//        return bedrooms;
//    }

    public void checkin(ArrayList<Guest> guests, int roomNumber) {
        Bedroom foundBedroom = findBedroom(roomNumber);
        if (foundBedroom == null) return;
        foundBedroom.checkin(guests);
    }

    public Bedroom findBedroom(int roomNumber) {
        Bedroom foundBedroom = null;
        for (Bedroom currentBedroom : this.bedrooms) {
            if (currentBedroom.getRoomNumber() == roomNumber) {
                foundBedroom = currentBedroom;
                break;
            }
        }
        return foundBedroom;
    }

    public Booking bookRoom(int roomNumber, int nights) {
        Bedroom foundBedroom = this.findBedroom(roomNumber);
        if (foundBedroom == null) return null;
        return new Booking(foundBedroom, nights);
    }

    public ConferenceRoom getConferenceRoomByName(String name) {
        return this.conferenceRooms.get(name);
    }

    public ArrayList<Bedroom> findAllVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getNumberOfGuests() == 0) {
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }

    public void vacateRoom(int roomNumber) {
        Bedroom foundBedroom = this.findBedroom(roomNumber);
        if (foundBedroom == null) return;
        foundBedroom.vacate();
    }
}
