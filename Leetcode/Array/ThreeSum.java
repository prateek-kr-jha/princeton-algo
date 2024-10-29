import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static int search(int[] nums, int a) {
        int i = 0;
        int j = nums.length - 1;

        while(i <= j) {
            int curr = (i + j) / 2;
            System.out.println(curr + "-----------" + i + " " + j);
            if(nums[curr] == a) {
                return curr;
            } else if(nums[curr] > a) {
                j = curr - 1;
            } else {
                i = curr + 1;
            }
        }
        return -1;
    }

    public static List<List<Integer>> twoSum(int[] nums, int target, int j) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        int curr = 0;
        for(int i = 0; i < nums.length / 2; i++) {
            curr = target - nums[i];
            int idx = search(nums, curr); 
            if(idx > -1){
                List<Integer> l1 = new ArrayList<>();
                l1.add(i);
                l1.add(idx);
                l1.add(j);
                sol.add(l1);
            }
        }
        return sol;
    }
    // public static void main(String[] args) {
    //     int[] nums = {-1,0,5, -6};
    //     Arrays.sort(nums);
    //     System.out.println(search(nums, 10));
    //     List<List<Integer>> twoSum = twoSum(nums, -1);

    //     // for(int a: nums) {
    //     //     System.out.println(a);
    //     // }
    //     System.out.println(twoSum);
    // }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        for(int x: nums) {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(nums);
        // for(int x: nums) {
        //     System.out.print(x + " ");
        // }
        List<List<Integer>> sol = new ArrayList<>();

        for(int i = 0; i < num.length/2; i++) {
            sol 
        }


        
    
        System.out.println(sol);
    }
}