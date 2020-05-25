package binheap;

import java.util.ArrayList;

public class BinaryIntHeap implements binaryheap {
    private ArrayList<Integer> heapArray = new ArrayList<>();
    @Override
    public void BinaryIntHeap() {
        heapArray = new ArrayList<>(); // heap
    }

    @Override
    public void insert(int n) {
        heapArray.add(n); // we add the integer to the end of the heap
        int currentNode = heapArray.size() - 1; // let the last node be the current node

            while (currentNode > 0) { // while the current node is greater than 0
                int parentNode = (currentNode - 1) / 2; // parentNode for node at pos i => (i-1)/2
                // if the value at the current node is bigger than the value at the parentNode
                if (heapArray.get(currentNode).compareTo(heapArray.get(parentNode)) > 0) {
                    int storeVal = heapArray.get(currentNode); // store the value at current node before swaping
                    heapArray.set(currentNode, heapArray.get(parentNode)); // swap the current node with its parent
                    heapArray.set(parentNode, storeVal); // // swap
                } else break;
                currentNode = parentNode; // now the current node is one level up
            }
        }

    @Override
    public int pullHighest() {
        if(heapArray.size() == 0)
            return -1;

        int removedObj = heapArray.get(0);
        heapArray.set(0, heapArray.get(heapArray.size()-1));
        heapArray.remove(heapArray.size()-1);

        int currentNode = 0;

        while (currentNode < heapArray.size()) {
            int leftChild = (2 * currentNode) + 1;
            int rightChild = (2 * currentNode) + 2;
            int maxChild = 0;
            if (leftChild >= heapArray.size()) break;

            // Find which one of the children is larger
            if (rightChild < heapArray.size()) { // if we're inside the array-bound
                if (heapArray.get(rightChild) > heapArray.get(leftChild)) {
                    maxChild = rightChild; // if rightChild > leftChild, the maxChild is rightChild
                } else if (heapArray.get(leftChild) > heapArray.get(rightChild)) {
                    maxChild = leftChild; // else the leftChild is the maxChild
                }
            }

            // swap the current node with the maxChild (larger child)
            if (heapArray.get(maxChild) > heapArray.get(currentNode)) {
                int store = heapArray.get(maxChild); // store value of maxChild
                heapArray.set(maxChild, heapArray.get(currentNode)); // at pos maxChild,
                // put the value of the current node
                heapArray.set(currentNode, store); // set the stored value at pos currentNode
                currentNode = maxChild; // currentNode is now MaxChild.
            }
            else break;
        }
        return removedObj; // return the removed object
    }

    @Override
    public int size() {
        return heapArray.size();
    }

    @Override
    public boolean isEmpty() {
        if(heapArray.size() == 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return heapArray.toString();
    }
}
