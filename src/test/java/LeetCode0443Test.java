import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0443Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new char[]{'a'}, 1, "a"),
                Arguments.of(new char[]{'a','b'}, 2, "ab"),
                Arguments.of(new char[]{'a','a'}, 2, "a2"),
                Arguments.of(new char[]{'a','a','b', 'b', 'c', 'c', 'c'}, 6, "a2b2c3")
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(char[] input, int expected, String out) {
        assertEquals(expected, new LeetCode0443().approachOne(input));
        assertEquals(out, String.valueOf(input).substring(0, expected));
    }
}