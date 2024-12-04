import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1455Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of("i love eating burger", "burg", 4),
                Arguments.of("this problem is an easy problem", "pro", 2),
                Arguments.of("i am tired", "you", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void isPrefixOfWord(String sentence, String searchWord, int expected) {
        assertEquals(expected, new LeetCode1455().isPrefixOfWord(sentence, searchWord));
    }
}