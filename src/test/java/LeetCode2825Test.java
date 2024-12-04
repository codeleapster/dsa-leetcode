import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2825Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("abc", "ad", true),
                Arguments.of("zc", "ad", true),
                Arguments.of("ab", "d", false),
                Arguments.of("zbcscce", "adcf", true)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void canMakeSubsequence(String s1, String s2, boolean expected) {
        assertEquals(expected, new LeetCode2825().canMakeSubsequence(s1, s2));
    }
}