package string;

//Given a string. Find the longest substring without repeating characters

import org.junit.Test;

public class findTheLongest {


    public String findTheLongest(String str) {

        String result1 = "";
        int len = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                for (int k = i; k < j; k ++) {
                    if (result1.indexOf(str.charAt(k)) != -1 && len < str.length()) {
                        result1 += str.charAt(k);
                        len += 1;
                    }
                }


            }
        }

        System.out.println(result1);

        return result1;
    }

    //Given "ababcdbz" should return "abcd"
    @Test
    public void test1() {
        System.out.println(findTheLongest("ababcdbz"));
    }

    //Given "bbbbbbb" should return "b"
    @Test
    public void test2() {
        System.out.println(findTheLongest("bbbbbbb"));
    }
}



