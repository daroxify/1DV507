package count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
    private BST root = null;
    private int size;

    private class BST {
        Word value;
        BST left = null;
        BST right = null;

        BST(Word val) {
            value = val;
        }

        void add(Word w) {

            if (w.compareTo(this.value) < 0) { // the smaller ones are on the left side
                if (left == null) { // if we have'nt added any word yet
                    left = new BST(w); // we create a new BST
                    size++; // and increase the size when we add it.
                } else {
                    left.add(w); // else we make a recursive call
                }
            } else if (w.compareTo(this.value) > 0) { // the "bigger" words are on the right side
                if (right == null) { // also if its null we create a new BST and add it
                    right = new BST(w); // and increase the size
                    size++;
                } else {
                    right.add(w); // recursive call
                }
            }
        }

        boolean contains(Word word) {
            if (word.compareTo(this.value) < 0) { // the smaller ones are stored on the left side
                if (left == null) { // if we havent added anyting on the left side
                    return false; // we can return false immediatly
                } else { // else we search the left branch recursively
                    return left.contains(word);
                }
            } else if (word.compareTo(this.value) > 0) { // the bigger ones are stored on the right side
                if (right == null) { // if we haven't added anything yet
                    return false; // we can return fale
                } else { // else we search in the right branch
                    return right.contains(word);
                }
            }
            return true;
        }
    }


    @Override
    public void add(Word word) {
        if (!contains(word)) {
            if (root == null) { // if the root is null
                root = new BST(word); // we create a new BST
                size++; // increase size
            } else if (!root.contains(word)) {
                root.add(word);
            }
        }
    }

    @Override
    public boolean contains(Word word) {
        if (size == 0) { // if the size is 0 we havent added anything yet
            return false; // so it cant contain the word.
        } else {
            return root.contains(word); // we call the private inner class contains.
        }
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder SB = new StringBuilder();
        Iterator<Word> iterator = iterator();

        while (iterator.hasNext()) {
            Word w = iterator.next(); // next returns every word from the word-array
            SB.append(w).append(" ");
        }
        return SB.toString();
    }


    @Override
    public Iterator<Word> iterator() {
        return new treeIter();
    }

    private class treeIter implements Iterator<Word> {
        Word[] words = new Word[size];
        int i = 0;
        int k = 0;

        public treeIter() {
            if (root == null) { // if the root is null we have nothing to iterate over.
                return;
            } else {
                k = 0;
                diveIn(root); // we always start from the root
            }
        }

        private void diveIn(BST curr) {
            if(curr == null) return;
                diveIn(curr.left); // else we go all the way to the left
            words[k++] = (curr.value); // and att the value to the word-array
                diveIn(curr.right); // then we turn right
        }

        @Override
        public boolean hasNext() {
            if (i < size) {
                return true;
            }
            return false;
        }

        @Override
        public Word next() {
            if (hasNext()) {
                return words[i++];
            }
            return null;
        }
    }
}
