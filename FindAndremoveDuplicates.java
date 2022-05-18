
  import java.util.*;

    public class FindAndremoveDuplicates {

        public static void main(String[] args) {
            int[] nums = { 1, 1, 2, 2, 6 };
            System.out.println(Arrays.toString(removeDuplicates(nums)));
        }

        
        public static int[] removeDuplicates(int[] nums) {
            int count = 0; //{ 1, 1, 2, 2, 6 }
            for (int i = 0; i < nums.length; i++) {
                if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    continue;
                }
                nums[count] = nums[i];
                count++;
            }
            return nums;
        }

        
    }

