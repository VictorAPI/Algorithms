package recursion;

import org.junit.Test;

public class strDist {

    public int strDist(String str, String sub) {

        if (!str.equals(sub) && str.length() <= sub.length()) return 0;
        if (!str.startsWith(sub)) return strDist(str.substring(1), sub);
        if (!str.endsWith(sub)) return strDist (str.substring(0, str.length()-1), sub);
        return str.length();

    }
}

//Given a string and a non-empty substring sub,
//compute recursively the largest substring which starts and ends with sub and return its length.