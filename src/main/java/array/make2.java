package array;

import org.junit.Test;

public class make2 {

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int lenA = a.length;
        if (lenA >2) lenA = 2;
        for (int i=0; i < lenA; i++)
            result[i] = a[i];
        int jIndex = 2-lenA;
        if (jIndex > 0) {
            for (int j=0;  j < jIndex; j++ )
                result[j+lenA] = b[j];
        }
        return result;
    }

}

//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
//the elements from a followed by the elements from b. The arrays may be any length, including 0,
//but there will be 2 or more elements available between the 2 arrays.