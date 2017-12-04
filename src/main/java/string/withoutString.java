package string;

import org.junit.Test;

public class withoutString {

    public String withoutString(String base, String remove) {
        String result = "";

        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length()) {
                String tmp = base.substring(i,i+remove.length());
                if (!tmp.equalsIgnoreCase(remove))
                    result += base.charAt(i);
                else {
                    i += remove.length()-1;
                }
            } else {
                String tmp2 = base.substring(i,i+1);
                if (!tmp2.equalsIgnoreCase(remove))
                    result += base.charAt(i);
            }
        }
        return result;
    }

}

//Given two strings, base and remove, return a version of the base string where all instances of the remove string
//have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
//Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".