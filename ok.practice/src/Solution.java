import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int first = seen.getOrDefault(target-curr, -1);
            if (first >= 0)
                return new int[]{first, i};
            seen.putIfAbsent(curr, i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arguments = {2,7,11,15};
        int[] answer = s.twoSum(arguments, 9);
        System.out.println(String.format("%d %d",answer[0], answer[1]));
    }
}
