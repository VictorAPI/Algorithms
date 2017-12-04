package string;

import org.junit.Test;

public class repeatFront {

    public String repeatFront(String str, int n) {
        String result = "";
        while (n >= 0) {
            result += str.substring(0, n);
            n -= 1;
        }
        return result;
    }

}

//Given a string and an int n, return a string made of the first n characters of the string,
//followed by the first n-1 characters of the string, and so on.
//You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).