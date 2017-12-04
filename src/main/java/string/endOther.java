package string;

import org.junit.Test;

public class endOther {

    public boolean endOther(String a, String b) {
        return ((a.length() >= b.length() && a.substring(a.length()-b.length()).toLowerCase().equals(b.toLowerCase()))
                || (b.length() > a.length() && b.substring(b.length()-a.length()).toLowerCase().equals(a.toLowerCase())) );
    }
}

//Given two strings, return true if either of the strings appears at the very end of the other string,
//ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
//Note: str.toLowerCase() returns the lowercase version of a string.