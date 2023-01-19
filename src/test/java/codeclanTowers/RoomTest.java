package codeclanTowers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    @Test
    public void canCalculateRoomSize() {
        assertEquals(12, Room.calculateSize(3, 4));
    }
}
