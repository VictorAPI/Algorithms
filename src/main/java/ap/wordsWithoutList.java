package ap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {
        List newList = new ArrayList();
        for (String s:words)
            if (s.length() != len)
                newList.add(s);
        return newList;
    }
}

//Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
//See wordsWithout() below which is more difficult because it uses arrays.
