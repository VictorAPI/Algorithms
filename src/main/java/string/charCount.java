package string;

import org.junit.Test;

public class charCount {

    public int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }


    @Test
    public void test() {
        String testString = "I'd love to connect with you and discuss the following: " +
                "I see you are working for <company name> and we would like to become " +
                "your representative in Ukraine and Eastern Europe. Please let me know if you might be interested in learning more about this mutually beneficial opportunity. Thank you.";
        System.out.println(count(testString));
    }
}
