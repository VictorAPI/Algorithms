package string;

import org.junit.Test;

public class deFront {

    public String deFront(String str) {
        if ((str.length()>1) && (str.charAt(1) != 'b'))
            str = str.charAt(0) + str.substring(2);
        if ((str.length()>0) && (str.charAt(0) != 'a'))
            str = str.substring(1);
        return str;
    }

}
