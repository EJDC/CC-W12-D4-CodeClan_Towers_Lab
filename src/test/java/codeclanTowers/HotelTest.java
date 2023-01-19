package codeclanTowers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private  Bedroom singleBedroom;
    private  Bedroom doubleBedroom;
    private  ConferenceRoom conferenceRoom;
    private  Guest guest1;
    private  Guest guest2;
    private  Hotel hotel;

    @Before
    public void setup() {
        singleBedroom = new Bedroom(101, RoomType.SINGLE);
        doubleBedroom = new Bedroom(201, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(100, "Johnson");
        guest1 = new Guest("Basil");
        guest2 = new Guest("Sybil");
        hotel = new Hotel(
                new ArrayList<>(Arrays.asList(singleBedroom, doubleBedroom)),
                new ArrayList<>(Arrays.asList(conferenceRoom))
        );

    }

    @Test
    public void checkinSingleGuestSingleBedroom(){
        hotel.checkin(
                new ArrayList<>(Arrays.asList(guest1)),
                101
        );
        assertEquals(1, singleBedroom.getNumberOfGuests());
        assertEquals(0, doubleBedroom.getNumberOfGuests());
    }

    @Test
    public void checkinSingleGuestDoubleBedroom(){
        hotel.checkin(
                new ArrayList<>(Arrays.asList(guest1)),
                201
        );
        assertEquals(0, singleBedroom.getNumberOfGuests());
        assertEquals(1, doubleBedroom.getNumberOfGuests());
    }

    @Test
    public void checkinTwoGuestsSingleBedroom(){
        hotel.checkin(
                new ArrayList<>(Arrays.asList(guest1, guest2)),
                101
        );
        assertEquals(0, singleBedroom.getNumberOfGuests());
        assertEquals(0, doubleBedroom.getNumberOfGuests());
    }

    @Test
    public void checkinTwoGuestsDoubleBedroom(){
        hotel.checkin(
                new ArrayList<>(Arrays.asList(guest1, guest2)),
                201
        );
        assertEquals(0, singleBedroom.getNumberOfGuests());
        assertEquals(2, doubleBedroom.getNumberOfGuests());
    }

    @Test
    public void checkinInvalidBedroom(){
        hotel.checkin(
                new ArrayList<>(Arrays.asList(guest1, guest2)),
                999
        );
        assertEquals(0, singleBedroom.getNumberOfGuests());
        assertEquals(0, doubleBedroom.getNumberOfGuests());
    }
}

