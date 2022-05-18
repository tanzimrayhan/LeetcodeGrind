/**
 * ContainsDuplicate
//  */
import java.util.*;
public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] nums={12,245,311,460};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
       
       HashSet <Integer> set = new HashSet<Integer>(); // Set=1,2,3,4 
       for (int i=0; i<nums.length; i++) {
           if(set.contains(nums[i])) {
               return true;
           }
            set.add(nums[i]);
       }

        return false;
    }
}