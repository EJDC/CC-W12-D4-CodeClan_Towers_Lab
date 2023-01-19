package codeclanTowers;

import static org.junit.Assert.*;

public class GuestTest {

    private Guest guest;

    @org.junit.Before
    public void setUp() {
        guest = new Guest("Basil");
    }

    @org.junit.Test
    public void hasName() {
        assertEquals("Basil", guest.getName());
    }
}