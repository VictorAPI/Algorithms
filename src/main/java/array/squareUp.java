package array;

import org.junit.Test;

public class squareUp {

    public int[] squareUp(int n) {

        int[] array = new int[n*n];
        int pass = 1;

        if(n == 0) return array;

        for (int i=n-1; i<array.length; i+=n) {
            int k = i;
            for (int j=1; j <= pass; j++) {
                array[k] = j;
                k--;
            }
            pass++;
        }
        return array;
    }

}

//Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
