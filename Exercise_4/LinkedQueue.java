package Exercise_4;


import java.util.Iterator;

/**
 * A class implementing interface IntQueue.
 * The class creates a queue, that have methods to remove, add, print and too
 * see the first and last element in the queue.
 *
 * @author Enida Ahmic
 */
public class LinkedQueue implements IntQueue {
    private int size= 0;
    private Node head = null;
    private Node tail = null;

    /***
     * Private inner Node class.
     */
    private class Node {
        int value;
        Node next = null;

        /***
         *
         * @param v is element integer to be put in
         *          node.
         */
             Node(int v) {
            value = v;
        }
    }

    /***
     * The iterator iterates through the queue.
     * @return a new Queue iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new QueueIterator();
    }

    /***
     * Inner iterator class.
     * Iterates through queue while next node is not null.
     */
    private class QueueIterator implements Iterator<Integer> {
        private Node node = head; // first node is head

        /***
         * Checks if has next while next is not null.
         * @return node if not null.
         */
        @Override
        public boolean hasNext() {
            return node != null; // has next while next is not null
        }

        /***
         * Reads value of element integer in node.
         * @return value of element integer in node.
         */
        @Override
        public Integer next() {
            int val = node.value; // read current value
            node = node.next;   // move one step ahead
            return val;
        }

        /***
         * Remove-method is not implementet,
         * @throws RuntimeException if method is called.
         */
        @Override
        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }


    /***
     * Size count current elements in queue.
     * @return how many elements are currently in the queue.
     */

    @Override
    public int size() {
        return size;
    }

    /***
     * Checking if queue is empty or not.
     * @return true if queue is empty, and false if not empty.
     */
    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    /***
     * Inserts integer <code>element</code> at the end of
     * queue.
     * @param element integer to be added.
     */
    @Override
    public void enqueue(int element) {

        if(head == null){ // if list is empty
            head = new Node(element);//Node becomes both
            tail = head;//head and tail
        } else {
            tail.next = new Node(element);
            tail = tail.next;
            }
        size++;
        }

    /***
     * Returns and removes first element integer.
     * @throws RuntimeException if stack is empty.
     * @return removed element integer.
     */
    @Override
    public int dequeue() {
        int toDelete;
        if(head == null){
            throw new RuntimeException();
        }
            else if (head == tail) { // if only one element
                toDelete = head.value;
                head = null;
                tail = null;
            } else {
                toDelete = head.value; // save value we delete
                head = head.next; // head moves one step forward.
            }
            size--; // current size decreases.
            return toDelete;
        }

    /***
     * Returns without removing first element integer
     * in queue.
     * @return first element integer in queue.
     * @throws NullPointerException if Queue is empty.
     */
    @Override
    public int first(){
        return head.value; // head is the first node.
    }

    /***
     * Returns without removing last element integer
     * in queue.
     * @return last element integer in queue.
     * @throws NullPointerException if queue is empty.
     */
    @Override
    public int last() { // tail is the last element
        return tail.value;
    }

    /***
     * Create a string for a nice printout with all
     * elements in queue.
     * @return string containing all elements in queue.
     */
    public String toString(){
        Iterator<Integer> it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (it.hasNext()){
            sb.append(" ").append(it.next());
        }
        sb.append(" ]");
        return sb.toString();
    }
}
