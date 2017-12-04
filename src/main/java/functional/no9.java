package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class no9 {

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n%10 != 9)
                .collect(Collectors.toList());
    }
}

//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
//Note that the boolean logic of filter() is the opposite of removeIf().