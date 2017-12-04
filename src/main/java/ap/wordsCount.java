package ap;

import org.junit.Test;

public class wordsCount {

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words)
            if (word.length() == len) count++;
        return count;
    }
}

//Given an array of strings, return the count of the number of strings with the given length.
