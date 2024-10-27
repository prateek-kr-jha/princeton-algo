import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
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
    public static void main(String[] args) {
        int[] num = {3,2,4};

        int[] twoSum = twoSum(num, 6);

        for(int a: twoSum) {
            System.out.println(a);
        }
    }
}
