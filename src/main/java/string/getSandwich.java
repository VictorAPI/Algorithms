package string;

import org.junit.Test;

public class getSandwich {

    public String getSandwich(String str) {

        String result = "";
        boolean found = false;

        if (str.length() > 10) {

            int start = 0;
            int finish = 0;

            for (int i = 0; i <= str.length() - 5; i++) {
                if (str.substring(i, i+5).equals("bread") && found == true)
                    finish = i;
                if (str.substring(i, i+5).equals("bread") && found == false) {
                    start = i+5;
                    found = true;
                }
            }
            result = str.substring(start, finish);
        }
        return result;
    }
}

//A sandwich is two pieces of bread with something in between.
//Return the string that is between the first and last appearance of "bread" in the given string,
//or return the empty string "" if there are not two pieces of bread.