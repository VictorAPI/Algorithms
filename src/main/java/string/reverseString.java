package string;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseString {
    public String reverseString(String str) {
        if(str==null ||str.length()==0) return "";
        StringBuilder tmp = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--)
            tmp.append(str.charAt(i));
        return tmp.toString();
    }

//     public String reverseString(String s) {
//         char[] c = s.toCharArray();
//         int l = c.length-1;
//         int mid = (l+1)/2;
//         char t;
//         for(int i=0; i<mid; i++){
//             t = c[i];
//             c[i] = c[l-i];
//             c[l-i] = t;
//         }
//         return String.valueOf(c);
//     }

    @Test
    public void test1() {
        String str = "Bread";
        String expected = "daerB";
        assertEquals(reverseString(str), expected,
                "Something went wrong with test1");
        System.out.println("Initial string: " + reverseString(str) + "\nResult: " + expected);
    }

    @Test
    public void test2() {
        String str = "A man, a plan, a canal: Panama";
        String expected = "amanaP :lanac a ,nalp a ,nam A";
        assertEquals(reverseString(str), expected,
                "Something went wrong with test2");
        System.out.println("Initial string: " + reverseString(str) + "\nResult: " + expected);
    }

}
