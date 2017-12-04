package array;

import org.junit.Test;

public class seriesUp {

    public int[] seriesUp(int n) {

        int[] array = new int[n*(n + 1)/2];
        int i = 0;

        for (int j = 1; j <= n; j++)
            for (int k = 1; k <= j; k++)
                array[i++] = k;
        return array;
    }
}

//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
//Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
