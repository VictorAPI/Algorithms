package warmup;

import org.junit.Test;

public class stringX {

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!(i > 0 && i < str.length()-1 && str.charAt(i) == 'x'))
                result += str.charAt(i);
        return result;
    }

}

//Given a string, return a version where all the "x" have been removed.
//Except an "x" at the very start or end should not be removed.