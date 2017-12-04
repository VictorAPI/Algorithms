package warmup;

import org.junit.Test;

public class countXX {

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.substring(i, i + 2).equals("xx")) count++;
        return count;
    }
}

//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".