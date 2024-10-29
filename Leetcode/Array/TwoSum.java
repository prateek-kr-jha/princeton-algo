import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TwoSum {
    public static int[] twoSumHashMap(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            curr = target - nums[i];
            if(map.containsKey(curr)) {
                sol[0] = map.get(curr);
                sol[1] = i;
                return sol;
            }
            map.put(nums[i], i);
        }
        // for(int i = 0; i < nums.length; i++) {
        //     int newTarget = target - nums[i];
        //     if(map.containsKey(newTarget) && map.get(newTarget) != i) {
        //         sol[0] = i;
        //         sol[1] = map.get(newTarget);
        //         break;
        //     } 
        // }
        return sol;
    }

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

    public static List<List<Integer>> twoSum(int[] nums, int target) {
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
                sol.add(l1);
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,5, -6};
        Arrays.sort(nums);
        System.out.println(search(nums, 10));
        List<List<Integer>> twoSum = twoSum(nums, -1);

        // for(int a: nums) {
        //     System.out.println(a);
        // }
        System.out.println(twoSum);
    }
}
