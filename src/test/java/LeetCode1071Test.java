import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode1071Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("ABCABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", ""),
                Arguments.of("AAAAAAA", "AAAA", "A"),
                Arguments.of("AAAAAA", "AAAA", "AA"),
                Arguments.of("AAAAAA", "AAA", "AAA")

        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void testApproachOne(String str1, String str2, String expected) {
        assertEquals(expected, new LeetCode1071().approachOne(str1, str2));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void testApproachTwo(String str1, String str2, String expected) {
        assertEquals(expected, new LeetCode1071().approachTwo(str1, str2));
    }
}