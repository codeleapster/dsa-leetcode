import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2109Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of("LeetcodeHelpsMeLearn", new int[]{8,13,15}, "Leetcode Helps Me Learn"),
                Arguments.of("icodeinpython", new int[]{1,5,7,9}, "i code in py thon"),
                Arguments.of("spacing", new int[]{0,1,2,3,4,5,6}, " s p a c i n g")
        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void addSpaces(String input, int[] spaces, String expected) {
        assertEquals(expected, new LeetCode2109().addSpaces(input, spaces));
    }
}