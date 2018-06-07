package recursion;

//        Given an input integer number 15 , provide output in below format:

//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class incrementignOutput {


    private void incrementingOutput(int n) {

        int start = 1;
        int count = 1;
        for (int i = start; i < start + count; i++) {
            System.out.println(i);
            start = i + 1;
        }
        count++;
    }
    // while (count <= n) {
    //     for (int i=start; i < start+count; i++) {
    //         Systen.out.println(i);
    //     start = i+1;
    //     }
//        //     count++;
//        }
//        }
//
//        O (n^2)

    @Test
    public void test() {
        int start = 1;
        int[] nums = {1, 2, 3, 3};
        int target = 5;
        boolean expected = true;
//        assertTrue(groupSum5(start, nums, target) == expected,
//                "Expected: " + String.valueOf(expected) + ", Actual: " + String.valueOf(groupSum5(start, nums, target)));
//        System.out.println(String.valueOf(groupSum5(start, nums, target)));
    }
}