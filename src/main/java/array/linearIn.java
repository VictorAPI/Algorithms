package array;

import org.junit.Test;

public class linearIn {

    public boolean linearIn(int[] outer, int[] inner) {

        if (inner.length == 0) return true;

        int k = 0;

        for(int i = 0; i < outer.length; i++) {
            if(outer[i] == inner[k])  k++;
            if(k == inner.length) return true;
        }
        return false;
    }
}

//Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
//The best solution makes only a single "linear" pass of both arrays,
//taking advantage of the fact that both arrays are already in sorted order.