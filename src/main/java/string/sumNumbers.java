package string;

//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
//A number is a series of 1 or more digit chars in a row.
//(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string)
//converts a string to an int.)

import org.junit.Test;

public class sumNumbers {

    public int sumNumbers(String str) {
        int sum = 0;
        String tmp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                tmp += str.charAt(i);
                if (!(i < str.length() - 1 && Character.isDigit(str.charAt(i + 1)))) {
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }
            }
        }
        return sum;
    }

    @Test
    public void test() {
        String str = "ab*c2d";
        System.out.println(sumNumbers(str));
    }

    @Test
    public void test2() {
        String str = "a2b*3*c34d";
        System.out.println(sumNumbers(str));
    }
}