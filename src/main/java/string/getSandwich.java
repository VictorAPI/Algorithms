package string;

//A sandwich is two pieces of bread with something in between.
//Return the string that is between the first and last appearance of "bread" in the given string,
//or return the empty string "" if there are not two pieces of bread.

import org.junit.Test;

public class getSandwich {

    public String getSandwich(String str) {

        String slice = "bread";
        String result = "";
        boolean found = false;

        if (str.length() > slice.length() * 2) {

            int start = 0;
            int finish = 0;

            for (int i = 0; i <= str.length() - slice.length(); i++) {
                if (str.substring(i, i + slice.length()).equalsIgnoreCase(slice) && found == false) {
                    start = i + slice.length();
                    found = true;
                }
                if (str.substring(i, i + slice.length()).equalsIgnoreCase(slice) && found == true)
                    finish = i;
            }
            result = str.substring(start, finish);
        }
        return result;
    }

    @Test
    public void test() {
        String str = "bread123bread";
        System.out.println(getSandwich(str));
    }

    @Test
    public void test2() {
        String str = "breadbrea";
        System.out.println(getSandwich(str));
    }
}