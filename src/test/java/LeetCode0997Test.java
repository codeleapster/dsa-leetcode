import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0997Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}}, 2, 2),
                Arguments.of(new int[][]{{1,3},{2,3}}, 3, 3),
                Arguments.of(new int[][]{{1,3}, {2,3}, {3,1}}, 3, -1)
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void findJudge(int[][] trust, int n, int expected) {
        assertEquals(expected, new LeetCode0997().findJudge(n, trust));
    }
}