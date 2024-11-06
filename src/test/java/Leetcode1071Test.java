import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode1071Test {

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
    void testcase(String str1, String str2, String expected) {
        assertEquals(expected, new Leetcode1071().gcdOfStrings(str1, str2));
    }
}