import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0334Test {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, true),
                Arguments.of(new int[]{5,4,3,2,1}, false),
                Arguments.of(new int[]{2,1,5,0,4,6}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[] nums, boolean expected) {
        assertEquals(expected, new LeetCode0334().approachOne(nums));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(int[] nums, boolean expected) {
        assertEquals(expected, new LeetCode0334().approachTwo(nums));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachThree(int[] nums, boolean expected) {
        assertEquals(expected, new LeetCode0334().approachThree(nums));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachFour(int[] nums, boolean expected) {
        assertEquals(expected, new LeetCode0334().approachFour(nums));
    }
}