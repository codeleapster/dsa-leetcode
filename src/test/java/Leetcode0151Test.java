import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode0151Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void approachOne(String input, String target) {
        assertEquals(target, new Leetcode0151().approachOne(input));
    }
}