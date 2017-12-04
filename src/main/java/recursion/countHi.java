package recursion;

import org.junit.Test;

public class countHi {

    public int countHi(String str) {
        if (str.length()<2) return 0;
        int count = 0;
        if (str.substring(0,2).equals("hi")) count = 1;
        return count + countHi(str.substring(1));
    }
}

//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.