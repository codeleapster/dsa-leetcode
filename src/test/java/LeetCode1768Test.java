import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1768Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void testApproachOne(String str1, String str2, String expected) {
        assertEquals(expected, new LeetCode1768().approachOne(str1, str2));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void testApproachTwo(String str1, String str2, String expected) {
        assertEquals(expected, new LeetCode1768().approachTwo(str1, str2));
    }
}