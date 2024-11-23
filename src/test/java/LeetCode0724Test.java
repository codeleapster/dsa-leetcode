import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0724Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3),
                Arguments.of(new int[]{1, 2, 3}, -1)
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[] nums, int expected) {
        assertEquals(expected, new LeetCode0724().approachOne(nums));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(int[] nums, int expected) {
        assertEquals(expected, new LeetCode0724().approachTwo(nums));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachThree(int[] nums, int expected) {
        assertEquals(expected, new LeetCode0724().approachThree(nums));
    }
}