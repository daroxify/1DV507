package Exercise_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class tester {
    private LinkedQueue linkedQueue = new LinkedQueue();

    @Test
    public void testingSize(){
        IntQueue que = new LinkedQueue();
        IntQueue emptyQue = new LinkedQueue();
        que.enqueue(3);
        que.enqueue(2);
        que.enqueue(1);

        assertEquals(3, que.size());
        assertEquals(0, emptyQue.size()); // we test this when queue is empty too
    }

    @Test
    public void testingIsEmpty(){
        IntQueue que = new LinkedQueue();
        que.enqueue(4);
        que.enqueue(91);
        que.enqueue(12);
        IntQueue emptyQueue = new LinkedQueue();

        assertTrue(emptyQueue.isEmpty()); // Que returns true
        assertFalse(que.isEmpty()); // a que not empty returns false
    }

    @Test
    public void testingEnqueue(){ // here we also test the class Next
        IntQueue que = new LinkedQueue();
        que.enqueue(4);

        assertEquals("[ 4 ]", que.toString()); // we can test the string method at the same time
        assertEquals(4,que.first()); // and we can test the first-method.
    }

    @Test
    public void testingDequeue(){
        IntQueue que = new LinkedQueue();
        que.enqueue(4); // dequeue removes first element=4, 3 remains
        que.enqueue(3);
        que.dequeue();
        assertEquals("[ 3 ]", que.toString()); // we can test it with the string-method
    }

    @Test
    public void testingFirst(){
        IntQueue que = new LinkedQueue();
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(-1);
        assertEquals(4,que.first());
    }

    @Test
    public void testingLast(){
        IntQueue que = new LinkedQueue();
        que.enqueue(3);
        que.enqueue(23);
        que.enqueue(92);
        assertEquals(92,que.last()); // we added 92 last
    }

    @Test
    public void testingToString(){ // in this test we also test the private class Node
        IntQueue que = new LinkedQueue();
        que.enqueue(3);
        que.enqueue(23);
        que.enqueue(92);
        assertEquals("[ 3 23 92 ]", que.toString());
    }
}
