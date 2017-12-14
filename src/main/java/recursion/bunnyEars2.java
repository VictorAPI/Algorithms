package recursion;

//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
//The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
//Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class bunnyEars2 {

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
        else return 2 + bunnyEars2(bunnies - 1);
    }

    @Test
    public void test() {
        int index = 3;
        int expected = 7;
        assertTrue(bunnyEars2(index) == expected,
                "Expected: " + expected + ", Actual: " + bunnyEars2(index));
        System.out.println(bunnyEars2(index));
    }
}