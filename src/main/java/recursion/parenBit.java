package recursion;

//Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis
//and their contents, so "xyz(abc)123" yields "(abc)".

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class parenBit {

    public String parenBit(String str) {
        if (str.charAt(0) != '(')
            return parenBit(str.substring(1));
        if (str.charAt(str.length()-1) != ')')
            return parenBit(str.substring(0, str.length()-1));
        return str;
    }

    @Test
    public void test() {
        String start = "xdca(xaxa)345x";
        String expected = "(xaxa)";
        assertTrue(parenBit(start).equals(expected),
                "Expected: " + expected + ", Actual: " + parenBit(start));
        System.out.println(parenBit(start));
    }
}