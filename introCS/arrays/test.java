public class test {
    public static void main(String[] args) {
        int[] nums = {01};
        int swap_idx = nums.length - 1;
        int current_idx = 0;
        int duplicate = 0;
        int val = 1;
        while(current_idx <= swap_idx) {
            if(nums[current_idx] == val) {
                int temp = nums[swap_idx];
                nums[swap_idx] = nums[current_idx];
                nums[current_idx] = temp;
                swap_idx--;
                duplicate++;
            } else {
                current_idx++;
            }
        }
        System.out.println(swap_idx);
        System.out.println("printing array");
        for(int i = 0; i < swap_idx + 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
