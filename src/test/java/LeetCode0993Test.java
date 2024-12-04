import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0993Test {

    @Test
    void recentCounter() {
        RecentCounter rc = new RecentCounter();
        assertEquals(1, rc.ping(1));
        assertEquals(2, rc.ping(100));
        assertEquals(3, rc.ping(3001));
        assertEquals(3, rc.ping(3002));
    }

    @Test
    void recentCounter1() {
        RecentCounter1 rc = new RecentCounter1();
        assertEquals(1, rc.ping(1));
        assertEquals(2, rc.ping(100));
        assertEquals(3, rc.ping(3001));
        assertEquals(3, rc.ping(3002));
    }
}