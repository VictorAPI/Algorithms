package string;

import org.junit.Test;

public class withoutX2 {

    public String withoutX2(String str) {
        String result = "";
        if (str.length() > 1) {
            for (int i=0; i < 2; i++) {
                if (!(str.charAt(i) == 'x'))
                    result += str.charAt(i);
            }
        for (int i=2; i < str.length(); i++) {
            result += str.charAt(i);
        }
    }
        return result;
    }

}

//Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
//and otherwise return the string unchanged. This is a little harder than it looks.