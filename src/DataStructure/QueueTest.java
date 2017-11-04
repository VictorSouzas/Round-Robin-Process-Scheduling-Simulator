package DataStructure;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @org.junit.jupiter.api.Test
    void add() {
        Queue list = new Queue();
        list.add(2);
        assertEquals(1, list.getSize());
        list.add(3);
        assertEquals(2, list.getSize());
        list.add(4);
        assertEquals(3, list.getSize());
    }

}