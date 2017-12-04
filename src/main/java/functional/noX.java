package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class noX {

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(n -> removeX(n))
                .collect(Collectors.toList());
    }

    public String removeX (String str) {
        String result = "";

        if(str.length() == 0) return result;

        for (int i=0; i<str.length(); i++)
            if(str.charAt(i) == 'x') result += "";
            else result += str.charAt(i);
        return result;
    }
}

//Given a list of strings, return a list where each string has all its "x" removed.
