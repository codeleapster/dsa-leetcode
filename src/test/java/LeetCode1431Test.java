import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1431Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{2,3,5,1,3}, 3, Arrays.asList(true, true, true, false, true)),
                Arguments.of(new int[]{4,2,1,1,2}, 1, Arrays.asList(true,false,false,false,false)),
                Arguments.of(new int[]{12,1,12}, 10, Arrays.asList(true,false,true))
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void kidsWithCandies(int[] candies, int extraCandies, List<Boolean> expected) {
        assertEquals(expected, new LeetCode1431().kidsWithCandies(candies, extraCandies));
    }
}