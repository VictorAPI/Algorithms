package functional;

import org.junit.Test;
import java.util.List;

public class noZ {

    public List<String> noZ(List<String> strings) {
        strings.removeIf(str -> str.contains("z"));
        return strings;
    }
}

//Given a list of strings, return a list of the strings, omitting any string that contains a "z".
//Note: the str.contains(x) method returns a boolean