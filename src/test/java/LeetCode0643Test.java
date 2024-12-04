import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0643Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[]{5}, 1, 5.00000)
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void findMaxAverage(int[] nums, int k, double expected) {
        assertEquals(expected, new LeetCode0643().findMaxAverage(nums, k));
    }
}