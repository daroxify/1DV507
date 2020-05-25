package count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet {
    private int size;
    private Node[] buckets = new Node[8];

    @Override
    public Iterator<Word> iterator() {
        return new hashIter();
    }

    private class hashIter implements Iterator<Word> {
        Word[] w = new Word[size]; // a Word-array with the size of elements in bucket
        int i = 0; // we put it here so all methods can access it.
        int k = 0;
        public hashIter() {
            for (int j = 0; j < buckets.length ; j++) {
                Node node = buckets[j];
                while (node != null) {
                    w[i++] = node.value;
                    node = node.next;
                }
            }
            i = 0; // here we have to restore the value.
        }

        @Override
        public boolean hasNext() {
            if(k < size) {
                return true;
            }
            return false;
        }

        @Override
        public Word next() {
            if (hasNext()) {
                return w[k++];
            }
            else throw new NullPointerException();
        }
    }

    private class Node { // private inner class
        Word value;
        Node next = null;

        public Node(Word word) {
            value = word;
        }
    }
    public String toString() {
        StringBuilder SB = new StringBuilder();
        Iterator<Word> iterator = iterator();
        while (iterator.hasNext()){
            SB.append(iterator.next()).append(" ");
        }
        return SB.toString();
    }

    @Override
    public void add(Word word) {
        int pos = getHashBuck(word);
        Node node = buckets[pos];
        if (!contains(word)) {
            while (node != null) {
                node = node.next;
            }
            node = new Node(word);
            node.next = buckets[pos];
            buckets[pos] = node;
            size++;
        }
        if (size == buckets.length) {
            rehash();
        }
    }

    @Override
    public boolean contains(Word word) {
        int pos = getHashBuck(word);
        Node node = buckets[pos];
        while (node != null) {
            String s = node.value.toString();
            String wordS = word.toString();
            if (s.equals(wordS)) {
                return true;
            } else node = node.next;
        }
        return false;
    }

    private void rehash() {
        Node[] temp = buckets;
        buckets = new Node[2 * temp.length];
        size = 0;
        for (Node n : temp) {
            if (n == null) {
                continue;
            }
            while (n != null) {
                add(n.value);
                n = n.next;
            }
        }
    }

    private int getHashBuck(Word w) {
        String newW = w.toString();
        int hc = 0;
        for (int i = 0; i <newW.length() ; i++) {
            char c = newW.charAt(i);
            hc += Character.getNumericValue(c);
        }
        if (hc < 0) { // if negative we make it positive
            hc = -hc;
        }
        return hc % buckets.length; // in which bucket we will place it.
    }


    @Override
    public int size() {
        return size;
    }
}
