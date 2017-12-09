package logic;

//You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes,
//in the range 0..10, and "date" is the stylishness of your date's clothes.
//The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
//If either of you is very stylish, 8 or more, then the result is 2 (yes).
//With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class dateFashion {

    public int dateFashion(int you, int date) {
        int result = 0;
        if (you > 2 && date > 2) {
            if (you >= 8 || date >= 8) result = 2;
            if (you < 8 && date < 8) result = 1;
        }
        return result;
    }

    @Test
    public void test() {
        int you = 3, date = 9;
        int expected = 2;
        assertTrue(dateFashion(you, date) == expected,
                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(dateFashion(you, date)));
        System.out.println(String.valueOf(dateFashion(you, date)));
    }
}