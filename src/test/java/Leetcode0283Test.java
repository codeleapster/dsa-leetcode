import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode0283Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{0,1,0,3,12}, new int[]{1,3,12,0,0}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[] input, int[] expected) {
        new Leetcode0283().approachOne(input);
        assertArrayEquals(expected, input);
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(int[] input, int[] expected) {
        new Leetcode0283().approachTwo(input);
        assertArrayEquals(expected, input);
    }
}