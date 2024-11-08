import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Leetcode0001Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1}),
                Arguments.of(new int[]{3,4}, 6, new int[]{}),
                Arguments.of(new int[]{-2,-1,0,1,4}, 0, new int[]{1,3})
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, new Leetcode0001().approachOne(nums, target));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, new Leetcode0001().approachTwo(nums, target));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachThree(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, new Leetcode0001().approachThree(nums, target));
    }
}