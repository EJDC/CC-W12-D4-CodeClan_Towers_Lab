package codeclanTowers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {

    @Test
    public void singleRoomsHaveCapacityOfOne() {
        assertEquals(1, RoomType.SINGLE.getCapacity());
    }

    @Test
    public void doubleRoomsHaveCapacityOfTwo() {
        assertEquals(2, RoomType.DOUBLE.getCapacity());
    }
}
