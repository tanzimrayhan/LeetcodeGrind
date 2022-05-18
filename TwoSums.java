/**
 * TwoSums
 */
import java.util.*;
public class TwoSums {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("O(n) = "+ result[0] + ", " + result[1]);
        result = twoSumBruteForce(nums, target);
        System.out.println("O(n)^2 = "+ result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>(); //{3,0},{4,1},
        
        //int[] nums = {3,2,4};
        //target = 6;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])){
                result[1]=i;//2
                result[0]=map.get(nums[i]);//1
                return result;
            }
            else {
                int diff=target-nums[i];
                map.put(diff, i);
            }
        }
        return result;
    }



    public static int[] twoSumBruteForce(int[] nums, int target){
        int result[] = new int[2];

        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}