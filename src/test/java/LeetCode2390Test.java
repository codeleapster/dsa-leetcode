import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2390Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of("leet**cod*e", "lecoe"),
                Arguments.of("erase*****", ""));
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void usingStack(String input, String expected) {
        assertEquals(expected, new LeetCode2390().usingStack(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void usingStringBuilder(String input, String expected) {
        assertEquals(expected, new LeetCode2390().usingStringBuilder(input));
    }
}