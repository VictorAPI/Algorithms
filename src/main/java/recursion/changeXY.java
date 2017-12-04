package recursion;

import org.junit.Test;

public class changeXY {

    public String changeXY(String str) {
        if (str.length() == 0) return "";
        String newStr = "";
        if (str.substring(0,1).equals("x")) newStr += "y";
        else newStr += str.substring(0,1);
        return newStr + changeXY(str.substring(1));
    }

}

//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
