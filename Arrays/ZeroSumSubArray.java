import java.util.*;
public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] nums = {-5, -5, 2, 3, -2};
        System.out.println(zeroSumSubarray(nums));
    }
    public static boolean zeroSumSubarray(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;

            // If the sum becomes zero at any point, there is a subarray with a sum of zero.
            if (sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        // No zero-sum subarray found.
        return false;
    }
}
