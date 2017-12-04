package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class no34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() != 3 && n.length() != 4)
                .collect(Collectors.toList());
    }

}

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
