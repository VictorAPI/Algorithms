package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class noYY {

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(string -> string + "y" )
                .filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }

}

//Given a list of strings, return a list where each string has "y" added at its end,
//omitting any resulting strings that contain "yy" as a substring anywhere.