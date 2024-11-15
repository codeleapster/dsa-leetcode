import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0345Test {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm"),
                Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(String s, String expected) {
        assertEquals(expected, new LeetCode0345().approachOne(s));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachTwo(String s, String expected) {
        assertEquals(expected, new LeetCode0345().approachTwo(s));
    }
}