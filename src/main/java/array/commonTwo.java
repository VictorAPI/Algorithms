package array;

//Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
//Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays,
//taking advantage of the fact that they are in alphabetical order.

import org.junit.Test;

public class commonTwo {

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int start = 0;
        String currentString = "";
        for (int i = 0; i < a.length; i++)
            for (int j = start; j < b.length; j++)
                if (a[i] == b[j] && a[i] != currentString) {
                    count++;
                    start++;
                    currentString = a[i];
                }
        return count;
    }

    @Test
    public void testCommon() {
        String[] firstArray = new String[]{"asba", "werwerw", "asd", "asdasdd", "HelloVleH"};
        String[] secondArray = new String[]{"asba", "asd", "HelloVleH"};
        System.out.println(commonTwo(firstArray, secondArray));
    }
}