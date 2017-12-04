package recursion;

import org.junit.Test;

public class countHi2 {

    public int countHi2(String str) {
        if (str.length() <2 ) return 0;
        if (str.length() > 2 && str.charAt(0) == 'x' && str.substring(1,3).equals("hi"))
            return 0 + countHi2(str.substring(3));
        else if (str.substring(0,2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        else return 0 + countHi2(str.substring(1));
    }

}

//Given a string, compute recursively the number of times lowercase "hi" appears in the string,
// however do not count "hi" that have an 'x' immediately before them.