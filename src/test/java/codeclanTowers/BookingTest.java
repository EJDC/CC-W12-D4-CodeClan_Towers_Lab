package codeclanTowers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void setUp()  {
        bedroom = new Bedroom(101, RoomType.DOUBLE, 50);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void canCalculateTotalBill() {
        assertEquals(250, booking.totalBill());
    }
}