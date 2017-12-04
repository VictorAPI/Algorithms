package string;

import org.junit.Test;

public class xyzMiddle {

    public boolean xyzMiddle(String str) {
        int mid = str.length() / 2;
        if (str.length() > 2) {
            if ((str.length() % 2) == 0) {
                for (int i = mid-2; i < (str.length() / 2 ); i++)
                    if (str.substring(i, i+3).equals("xyz")) return true;
            } else {
                for (int i = mid-1; i < (str.length() / 2 ); i++)
                    if (str.substring(i, i+3).equals("xyz")) return true;
            }
        }
        return false;
    }

}

//Given a string, does "xyz" appear in the middle of the string? To define middle,
//we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
//This problem is harder than it looks.