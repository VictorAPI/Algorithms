package string;

//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
//The word "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not count.
//(Note: Character.isLetter(char) tests if a char is a letter.)

import org.junit.Test;

public class notReplace {

    public String notReplace(String str) {

        for (int i = 0; i < str.length() - 1; ++i) {
            if ((i == 0
                    || !Character.isLetter(str.charAt(i - 1))) && str.substring(i).startsWith("is") && (i == str.length() - 2
                    || !Character.isLetter(str.charAt(i + 2)))) {
                str = str.substring(0, i) + "is not" + str.substring(i + 2);
                i += 5;
            }
        }
        return str;
    }

    @Test
    public void test() {
        String str = "iso bread is 1221bread";
        System.out.println(notReplace(str));
    }

    @Test
    public void test2() {
        String str = "isn't breadb this read";
        System.out.println(notReplace(str));
    }
}