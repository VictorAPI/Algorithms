package logic;

import org.junit.Test;

public class withoutDoubles {

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1+die2;
        if (noDoubles && die1 == die2 && die1 < 6) sum += 1;
        if (noDoubles && die1 == die2 && die1 == 6) sum -= 5;
        return sum;
    }

}

//Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true,
//if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.