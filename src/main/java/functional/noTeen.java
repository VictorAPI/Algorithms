package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class noTeen {

    public List<Integer> noTeen(List<Integer> nums) {

        return nums.stream()
                .filter(n -> n <13 || n>19)
                .collect(Collectors.toList());
    }
}

//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
//Note that the boolean logic of filter() is the opposite of removeIf().