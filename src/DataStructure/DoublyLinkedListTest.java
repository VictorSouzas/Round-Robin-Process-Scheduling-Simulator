package DataStructure;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    @org.junit.jupiter.api.Test
    void add() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(2);
        assertEquals(1, list.getSize());
        list.add(3);
        assertEquals(2, list.getSize());
        list.add(4);
        assertEquals(3, list.getSize());
    }

}