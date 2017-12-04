package recursion;

import org.junit.Test;

public class strCopies {

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) return true;
        if (str.length() < sub.length()) return false;

        if (str.substring(0,sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n-1);
        else return strCopies(str.substring(1), sub, n);
    }

}

// int count = 0;
//   for (int i=0; i <= str.length()-sub.length(); i++)
//     if (str.substring(i,i+sub.length()).equals(sub)) count++;
//   return n == count;
// }

//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere,
//possibly with overlapping. N will be non-negative.