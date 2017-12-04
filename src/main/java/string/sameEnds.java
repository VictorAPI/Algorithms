package string;

import org.junit.Test;

public class sameEnds {

    public String sameEnds(String string) {

        String result = "";
        String tmp = "";

        for (int i = 0; i < string.length() / 2; i++) {
            tmp += string.charAt(i);
            if (tmp.equals(string.substring(string.length()-tmp.length())))
                result = tmp;
        }
        return result;
    }
}

//Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
//For example, sameEnds("abXab") is "ab".
