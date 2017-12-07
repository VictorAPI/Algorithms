package string;

//Given a string and a non-empty word string, return a version of the original String where all chars have been replaced
//by pluses ("+"), except for appearances of the word string which are preserved unchanged.

import org.junit.Test;

public class plusOut {

    public String plusOut(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= (str.length() - word.length())
                    && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length() - 1;
            } else {
                result += '+';
            }
        }
        return result;
    }

    @Test
    public void test() {
        String str = "iso bread is 1221bread";
        String word = "ad";
        System.out.println(plusOut(str, word));
    }

    @Test
    public void test2() {
        String str = "isn't breadb this read";
        String word = "this";
        System.out.println(plusOut(str, word));
    }
}