package easy;
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        int []nums = {2,11,7,15};
        int target = 9;
        int []result = twoSum(nums, target);
        if(result != null){
            System.out.println("The two numbers are: " + result[0] + " and " + result[1]);
        }
    }
    public static int[] twoSum(int[]nums,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(hm.containsKey(rem)){
                return new int[]{hm.get(rem),i};
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}