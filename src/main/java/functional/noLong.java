package functional;

//Given a list of strings, return a list of the strings, omitting any string length 4 or more.

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class noLong {

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() < 4)
                .collect(Collectors.toList());
    }

    @Test
    public void test() {
        List<String> testList = Arrays.asList("asd", "dfgr", "34", "5");
        List<String> expectedList = Arrays.asList("asd", "34", "5");
        assertTrue(noLong(testList).equals(expectedList),
                "Expected: " + String.valueOf(expectedList) + ", Actual: " + String.valueOf(noLong(testList)));
        System.out.println(String.valueOf(noLong(testList)));
    }
}

//        Java Functional API
//
//        list.replaceAll(lambda) -- calls the lambda once for each item in the list, storing the result back into the list (or other type of collection).
//        e.g. nums.replaceAll(n -> n * 2);
//
//        list.removeIf(lambda) -- calls the lambda once for each item in the collection, removing each item where the lambda returns true.
//        e.g. nums.removeIf(n -> n < 0);
//
//        Simple Lambda Examples -- the data types are inferred from the context and from the type of the expression following the "->":
//        n -> n * 2 -- takes Integer, returns Integer
//        n -> n < 0 && n >= -10 -- takes Integer, returns boolean
//        s -> s.length()  -- takes String, returns Integer
//        s -> s.startsWith("hi") -- takes String, returns boolean
//
//        The Java stream system provides more complicated lambda features. The stream calls do not modify the original list, returning a new data structure of the results. Note that the boolean logic of filter() is the opposite of removeIf().
//
//        List<Integer> nums = -something-;
//        nums = nums.stream()
//        .map(n -> n * 2)
//        .filter(n -> n >= 0)
//        .collect(Collectors.toList());