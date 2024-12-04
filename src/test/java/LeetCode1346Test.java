import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1346Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{10,2,5,3}, true),
                Arguments.of(new int[]{3,1,7,11}, false)
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void bruteForce(int[] input, boolean expected) {
        assertEquals(expected, new LeetCode1346().bruteForce(input));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingHashSet(int[] input, boolean expected) {
        assertEquals(expected, new LeetCode1346().usingHashSet(input));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingSortAndBinarySearch(int[] input, boolean expected) {
        assertEquals(expected, new LeetCode1346().usingSortAndBinarySearch(input));
    }
}