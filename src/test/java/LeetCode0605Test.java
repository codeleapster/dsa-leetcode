import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0605Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1,0,0,0,1}, 1, true),
                Arguments.of(new int[]{1,0,0,0,1}, 2, false),
                Arguments.of(new int[]{1,0,0,0,0,0,1}, 2, true),
                Arguments.of(new int[]{1,0,0,0,1,0,0}, 2, true),
                Arguments.of(new int[]{0}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void canPlaceFlowers(int[] flowerBed, int n, boolean expected) {
        assertEquals(expected, new LeetCode0605().canPlaceFlowers(flowerBed, n));
    }
}