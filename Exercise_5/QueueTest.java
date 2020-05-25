package Exercise_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue<String> que = new LinkedQueue<>();
    Queue<Integer> intQue = new LinkedQueue<>();


    @Test
    public void testingSize(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);

        assertEquals(5, que.size());
        assertEquals(4,intQue.size());
    }

    @Test
    public void testingIsEmpty(){
        Queue<Integer> emptyIntQueue = new LinkedQueue<>(); // create empty int-queue
        Queue<String> emptyStringQueue = new LinkedQueue<>(); // create empty string-queue

        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);

        assertFalse(que.isEmpty()); // testing when not empty
        assertFalse(intQue.isEmpty()); // both with strings and integers

        assertTrue(emptyIntQueue.isEmpty()); // testing the both empty Queues
        assertTrue(emptyStringQueue.isEmpty());
    }

    @Test

    public void testingEnqueue(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);
// here we test both enqueue and toString
        assertEquals("[ Hello Bye Java Linné Yolo ]", que.toString());
        assertEquals("[ 4 7 1 92 ]", intQue.toString());
    }

    @Test
    public void testingDequeue(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");
        que.dequeue();

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);
        intQue.dequeue();
        // dequeue removes first element, we can test it on both ways:
        assertEquals("[ Bye Java Linné Yolo ]", que.toString()); // we can test it with toString
        assertEquals("Bye", que.first()); // and we can check the first when hello is removed

        assertEquals("[ 7 1 92 ]", intQue.toString()); // the 4 has been removed
        assertEquals(7, (int) intQue.first()); // we must cast to int because it expects an Object
    }

    @Test
    public void testingFirst(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);

        assertEquals("Hello", que.first());
        assertEquals(4, (int) intQue.first());
    }

    @Test
    public void testingLast(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);

        assertEquals("Yolo", que.last());
        assertEquals(92,(int) intQue.last());
    }

    @Test
    public void testingToString(){
        que.enqueue("Hello"); // add elements to the public queues
        que.enqueue("Bye");
        que.enqueue("Java");
        que.enqueue("Linné");
        que.enqueue("Yolo");

        intQue.enqueue(4);
        intQue.enqueue(7);
        intQue.enqueue(1);
        intQue.enqueue(92);

        assertEquals("[ Hello Bye Java Linné Yolo ]", que.toString());
        assertEquals("[ 4 7 1 92 ]", intQue.toString());
    }

}
