package string;

import org.junit.Test;

public class starOut {

    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i-1) == '*')) continue;
            if (i < str.length()-1 && str.charAt(i+1) == '*') continue;
            result += str.charAt(i);;
        }
        return result;
    }

}

//Return a version of the given string, where for every star (*) in the string the star and the chars
//immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
