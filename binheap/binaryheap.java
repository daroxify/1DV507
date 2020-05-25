package binheap;

public interface binaryheap {
    public void BinaryIntHeap(); // Constructs an empty heap
    public void insert(int n);  // add n to heap
    public int pullHighest();   // Return and remove element with highest priority
    public int size();          // Current heap size
    public boolean isEmpty();   // True if heap is empty

}
