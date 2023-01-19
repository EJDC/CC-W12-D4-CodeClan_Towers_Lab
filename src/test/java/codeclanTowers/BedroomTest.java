package codeclanTowers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;

    @Before
    public void setup() {
        singleBedroom = new Bedroom(101, RoomType.SINGLE, 35);
        doubleBedroom = new Bedroom(201, RoomType.DOUBLE, 50);
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, singleBedroom.getCapacity());
        assertEquals(2, doubleBedroom.getCapacity());

    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, singleBedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        Guest guest = new Guest("Manuel");
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.getNumberOfGuests());
    }

    @Test
    public void cannotAddTooManyGuests() {
        singleBedroom.addGuest(new Guest("The Colonel"));
        singleBedroom.addGuest(new Guest("Polly"));
        assertEquals(1, singleBedroom.getNumberOfGuests());
    }

    @Test
    public void canCalculateBedroomSize() {
        assertEquals(12, Bedroom.calculateSize(3, 4));
    }


}
