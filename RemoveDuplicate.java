import java.util.*;

public class RemoveDuplicate {

    public static int length=0;
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};

        
        removeDuplicate(nums);
        

    }

    public static void removeDuplicate(int[] nums){
        HashSet <Integer> set=new HashSet<>(); //n

        int [] res=new int[nums.length]; //n

        //n
        for(int i=0; i <nums.length; i++){
            if(set.contains(nums[i])){ //int nums[]={0,0,1,1,1,2,2,3,3,4};
                continue;
            }
            set.add(nums[i]);
        }


        //2n=n O(n)
        //n
       for(Integer i:set){
           System.out.print(i+", " );
       }

    }
}
