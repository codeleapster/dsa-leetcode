import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1861Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(
                        new char[][]{
                                {'#', '.', '#'}
                        },
                        new char[][]{
                                {'.'},
                                {'#'},
                                {'#'}
                        }
                ),
                Arguments.of(
                        new char[][]{
                                {'#', '.', '*', '.'},
                                {'#', '#', '*', '.'}
                        },
                        new char[][]{
                                {'#', '.'},
                                {'#', '#'},
                                {'*', '*'},
                                {'.', '.'}
                        }
                ),
                Arguments.of(
                        new char[][]{
                                {'#', '#', '*', '.', '*', '.'},
                                {'#', '#', '#', '*', '.', '.'},
                                {'#', '#', '#', '.', '#', '.'}
                        },
                        new char[][]{
                                {'.', '#', '#'},
                                {'.', '#', '#'},
                                {'#', '#', '*'},
                                {'#', '*', '.'},
                                {'#', '.', '*'},
                                {'#', '.', '.'}
                        }
                )
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void rotateTheBox(char[][] input, char[][] expected) {
        assertArrayEquals(expected, new LeetCode1861().rotateTheBox(input));
    }
}