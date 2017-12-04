package array;

import org.junit.Test;

public class front11 {

    public int[] front11(int[] a, int[] b) {
        int[] result2 = new int[2];
        int[] result1 = new int[1];
        int[] result = new int[0];
        if (a.length != 0 && b.length != 0) {
            result2[0] = a[0];
            result2[1] = b[0];
            return result2;
        }
        if (a.length == 0 && b.length != 0) {
            result1[0] = b[0];
            return result1;
        }
        if (b.length == 0 && a.length != 0) {
            result1[0] = a[0];
            return result1;
        }
        return result;
    }

}

//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//If either array is length 0, ignore that array.