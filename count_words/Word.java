package count_words;

public class Word implements Comparable<Word> {
    private String word;

    public Word(String str){
        word = str.toLowerCase();
    }
    public String toString(){
        return word;
    }

    public int hashCode(){
        int hc = 0;
        for (int i = 0; i < word.length() ; i++) {
            char c = word.charAt(i);
            hc += Character.getNumericValue(c);
        }
        if(hc < 0){
            hc = -hc;
        }
        return hc;
    }

    public boolean equals(Object other) {
        if (other instanceof Word) {
            String inputStr = other.toString();
            String thisStr = this.toString();
            return inputStr.hashCode() == thisStr.hashCode();
        }
        return false;
    }


    @Override
    public int compareTo(Word w) {
        return word.compareTo(w.word);
    }
}
