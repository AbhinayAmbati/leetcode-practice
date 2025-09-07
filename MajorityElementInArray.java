import java.util.Arrays;

public class MajorityElementInArray {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len/2];
    }
}
