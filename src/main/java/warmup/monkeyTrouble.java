package warmup;

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class monkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

    @Test
    public void test() {
        boolean aSmile = true;
        boolean bSmile = true;
        assertTrue(monkeyTrouble(aSmile, bSmile) == true,
                "Expected: " + "true, " + "Actual: " + monkeyTrouble(aSmile, bSmile));
        System.out.println(monkeyTrouble(aSmile, bSmile));
    }

    @Test
    public void test2() {
        boolean aSmile = true;
        boolean bSmile = false;
        assertTrue(monkeyTrouble(aSmile, bSmile) == false,
                "Expected: " + "false, " + "Actual: " + monkeyTrouble(aSmile, bSmile));
        System.out.println(monkeyTrouble(aSmile, bSmile));
    }
}