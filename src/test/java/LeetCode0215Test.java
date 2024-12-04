import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0215Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{5, 9, 7, 2, 10, 3, 8, 1, 6, 4}, 3, 8),
                Arguments.of(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
                Arguments.of(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingSorting(int[] input, int k, int expected) {
        assertEquals(expected, new LeetCode0215().usingSorting(input, k));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingHeap(int[] input, int k, int expected) {
        assertEquals(expected, new LeetCode0215().usingHeap(input, k));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingQuickSelect(int[] input, int k, int expected) {
        assertEquals(expected, new LeetCode0215().usingQuickSelect(input, k));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void usingCountingSort(int[] input, int k, int expected) {
//        assertEquals(expected, new LeetCode0215().usingCountingSort(input, k));
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void using3wayQuickSelect(int[] input, int k, int expected) {
//        assertEquals(expected, new LeetCode0215().using3wayQuickSelect(input, k));
    }
}