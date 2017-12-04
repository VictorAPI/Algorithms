package recursion;

import org.junit.Test;

public class allStar {

    public String allStar(String str) {
        if (str.length() < 2) return str;
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}

//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".