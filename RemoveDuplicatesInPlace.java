import java.util.*;

public class RemoveDuplicatesInPlace {

    public static int length=0;
    public static void main(String[] args) {
        int [] nums={0,0,1,1,1,2,2,3,3,4};

        nums=removeDuplicatesInPlace(nums);
        System.out.println(Arrays.toString(nums)+"    length="+length);
    }

    public static int [] removeDuplicatesInPlace(int [] nums) {
        int count=0;
        int m=12;

        //O(1+1)=O(1)
        //n O(n)
        for(int i=0; i <nums.length; i++) {

            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }

            nums[count++]=nums[i];
        }
        length=count;

        return nums;
    }
}
