import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2215Test {

    public static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(new int[]{-80, -15, -81, -28, -61, 63, 14, -45, -35, -10},
                        new int[]{-1, -40, -44, 41, 10, -43, 69, 10, 2},
                        new int[][]{{-81, -35, -10, -28, -61, -45, -15, 14, -80, 63}, {-1, 2, 69, -40, 41, 10, -43, -44}})
        );
    }


    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void findDifference(int[] nums1, int[] nums2, int[][] expected) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.stream(expected[0]).boxed().toList());
        output.add(Arrays.stream(expected[1]).boxed().toList());
        assertEquals(output, new LeetCode2215().findDifference(nums1, nums2));
    }
}