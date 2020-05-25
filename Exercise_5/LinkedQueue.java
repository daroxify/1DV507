package Exercise_5;


import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    private class Node{
        T value;
        Node next = null;

        Node(T v){
            value = v;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(T element) {
        if(head == null){ // if list is empty, node becomes both head and tail.
            head = new Node(element);
            tail = head;
        } else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue() {
        T toDelete;
        if(head == tail){ // if only one element
            toDelete = head.value;
            head = null;
            tail = null;
        } else {
            toDelete = head.value;
            head = head.next;
        }
        size--;
        return toDelete;
    }

    @Override
    public T first() {
        return head.value; // head is the first element
    }

    @Override
    public T last() {
        return tail.value; // tail is the last element
    }

    public String toString(){
        Iterator<T> it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (it.hasNext()){
            sb.append(" ").append(it.next());
        }
        sb.append(" ]");
        return sb.toString();
    }


    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {
        private Node node = head;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public T next() {
            T val = node.value; // store current node-value
            node = node.next; // move one step forward
            return val;
        }
    }
}
