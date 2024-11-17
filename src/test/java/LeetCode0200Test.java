import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0200Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }, 1),
                Arguments.of(new char[][]{
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}
                }, 3),
                Arguments.of(new char[][]{
                        {'1', '1', '1'},
                        {'0', '1', '0'},
                        {'1', '1', '1'}
                }, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void numIslands(char[][] input, int expected) {
        assertEquals(expected, new LeetCode0200().numIslands(input));
    }
}