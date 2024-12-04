import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0841Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[][]{{1},{2},{3},{}}, true),
                Arguments.of(new int[][]{{1,3},{3,0,1},{2},{0}}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachDfs(int[][] input, boolean expected) {
        List<List<Integer>> rooms = TestInputUtil.transformInt2dArray(input);
        assertEquals(expected, new LeetCode0841().approachDfs(rooms));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachBfs(int[][] input, boolean expected) {
        List<List<Integer>> rooms = TestInputUtil.transformInt2dArray(input);
        assertEquals(expected, new LeetCode0841().approachBfs(rooms));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachDfsOptimized(int[][] input, boolean expected) {
        List<List<Integer>> rooms = TestInputUtil.transformInt2dArray(input);
        assertEquals(expected, new LeetCode0841().approachDfsOptimized(rooms));
    }


}