package recursion;

//Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
//Suggestion: check the first and last chars, and then recur on what's inside them.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class nestParen {

    public boolean nestParen(String str) {
        if (str.equals("")) return true;
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return nestParen(str.substring(1, str.length() - 1));
        else return false;
    }

    @Test
    public void test() {
        String start = "((()))";
        boolean expected = true;
        assertTrue(nestParen(start) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(nestParen(start)));
        System.out.println(String.valueOf(nestParen(start)));
    }
}