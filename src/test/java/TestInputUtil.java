import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TestInputUtil {

    public static List<List<Integer>> transformInt2dArray(int[][] int2dArray) {
        List<List<Integer>> output;
        output = Arrays.stream(int2dArray)
                .map(Arrays::stream)
                .map((IntStream::boxed))
                .map(values -> values.collect(Collectors.toList()))
                .collect(Collectors.toList());
        return output;
    }

}
