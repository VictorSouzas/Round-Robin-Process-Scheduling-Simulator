package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    protected Queue dependency;

    public QueueTest() {
        this.dependency = new Queue();
    }

    @Test
    void add() {
        dependency.add(2);
        assertEquals(1, dependency.getSize());
        dependency.add(3);
        assertEquals(2, dependency.getSize());
        dependency.add(4);
        assertEquals(3, dependency.getSize());
    }

    @Test
    void remove(){
        dependency.add(2);
        dependency.add(3);
        dependency.add(4);
        assertEquals(2, dependency.remove());
    }

}