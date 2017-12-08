package array;

//Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
//Return a new array containing the first N elements from the two arrays.
//The result array should be in alphabetical order and without duplicates.
//A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
//taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class mergeTwo {

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] newArray = new String[n];
        int aIndex = 0, bIndex = 0;

        for (int i = 0; i < n; i++) {
            int cmp = a[aIndex].compareTo(b[bIndex]);
            if (cmp <= 0) {
                newArray[i] = a[aIndex++];
                if (cmp == 0) bIndex++;
            } else newArray[i] = b[bIndex++];
        }
        return newArray;
    }

    @Test
    public void test() {
        String[] strA = {"cat", "dog", "elephant", "goose", "hedgehog", "zebra"};
        String[] strB = {"cat", "coyote", "elf", "gnome", "groundhog", "giraffe"};
        String[] expected = {"cat", "coyote", "dog", "elephant", "elf"};
        int testNum = 5;
        assertTrue(Arrays.equals(mergeTwo(strA, strB, testNum), expected),
                "Expected: " + Arrays.toString(expected) + ", Actual: " + Arrays.toString(mergeTwo(strA, strB, testNum)));
        System.out.println(Arrays.toString(mergeTwo(strA, strB, testNum)));
    }
}