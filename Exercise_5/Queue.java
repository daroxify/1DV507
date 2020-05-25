package Exercise_5;


public interface Queue<T> extends Iterable<T>{
    public int size();
    public boolean isEmpty();
    public void enqueue(T element);
    public T dequeue();
    public T first();
    public T last();
    public String toString();

}
