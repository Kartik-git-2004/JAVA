class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // return indices (1-based as per LeetCode problem statement)
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        // if not found
        return new int[]{-1, -1};
    }
}
