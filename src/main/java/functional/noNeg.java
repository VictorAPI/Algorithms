package functional;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class noNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}

//Given a list of integers, return a list of the integers, omitting any that are less than 0.
