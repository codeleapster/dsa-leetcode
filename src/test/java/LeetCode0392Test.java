import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0392Test {
    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false)
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void isSubsequence(String s, String t, boolean expected) {
        assertEquals(expected, new LeetCode0392().isSubsequence(s, t));
    }
}