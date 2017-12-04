package string;

import org.junit.Test;

public class zipZap {

    public String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i>0 && i<str.length()-1 && str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

}

//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".