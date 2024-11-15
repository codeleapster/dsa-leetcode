import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0238Test {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6}),
                Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[] nums, int[] out) {
        assertArrayEquals(out, new LeetCode0238().approachOne(nums));
    }

//    @ParameterizedTest
//    @MethodSource("inputsAndResults")
//    void approachTwo(int[] nums, int[] out) {
//        assertArrayEquals(out, new LeetCode0238().approachTwo(nums));
//    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachThree(int[] nums, int[] out) {
        assertArrayEquals(out, new LeetCode0238().approachThree(nums));
    }
}