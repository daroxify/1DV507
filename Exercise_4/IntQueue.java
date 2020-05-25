package Exercise_4;

/**
 * <p>
 * An interface representing an Integer Queue.
 * Provides support for accessing the methods: size,
 * isEmpty,enqueue, dequeue, first, last and toString.
 * <p/>
 * Currently available <code>IntQueue</code> implementations in the
 * <code>linked</code> package is:
 * <ul>
 *     <li>{@link LinkedQueue}</li>
 * </ul>
 *
 * @author Enida Ahmic
 * @see java.lang.Iterable
 * @since 2020-02-01
 */
public interface IntQueue extends Iterable<Integer> {
    public int size();  // current queue size
    public boolean isEmpty(); // true if queue is empty
    public void enqueue(int element); // add element at end of queue
    public int dequeue(); // return and remove first element
    public int first(); // return witout removing first
    public int last(); // return without removing last
    public String toString(); // return a string rep. of queue

}
