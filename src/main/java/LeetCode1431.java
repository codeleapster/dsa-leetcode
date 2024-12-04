import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0;
        for(int i=0; i<candies.length; i++) {
            highest = Integer.max(candies[i], highest);
        }

        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= highest) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
