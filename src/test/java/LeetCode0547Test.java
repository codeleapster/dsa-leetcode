import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0547Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 1, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }, 2),
                Arguments.of(new int[][]{
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}
                }, 3),
                Arguments.of(new int[][]{
                        {1, 0, 0, 1},
                        {0, 1, 1, 0},
                        {0, 1, 1, 1},
                        {1, 0, 1, 1}
                }, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(int[][] input, int expected) {
        assertEquals(expected, new LeetCode0547().approachOne(input));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(int[][] input, int expected) {
        assertEquals(expected, new LeetCode0547().approachTwo(input));
    }
}