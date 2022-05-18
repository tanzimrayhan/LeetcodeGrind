import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int extraCandies = 3;
        int[] candies = { 2, 3, 5, 1, 3 };

        List<Boolean> result = new ArrayList<>();
        KidsWithCandies k = new KidsWithCandies();
        result = k.kidsWithCandies(candies, extraCandies);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }

        }

        for (int j = 0; j < candies.length; j++) {
            int temp = candies[j] + extraCandies;

            if (temp >= max) {
                result.add(true);
            } else
                result.add(false);

        }

        return result;
    }
}
