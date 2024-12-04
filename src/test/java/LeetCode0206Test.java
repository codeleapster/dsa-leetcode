import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0206Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{5,4,3,2,1}),
                Arguments.of(new int[]{1,2}, new int[]{2,1}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void reverseList(int[] input, int[] expected) {
        ListNode head = new ListNode(input);
        ListNode listNode = new LeetCode0206().reverseList(head);
        assertArrayEquals(expected, listNode.asArray(listNode));
    }
}