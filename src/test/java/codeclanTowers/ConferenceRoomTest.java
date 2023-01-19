package codeclanTowers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void setup() {
        conferenceRoom = new ConferenceRoom(100, "Johnson");
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Johnson", conferenceRoom.getName());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }


    @Test
    public void canCalculateConferenceRoomSize() {
        assertEquals(12, ConferenceRoom.calculateSize(3, 4));
    }
}
