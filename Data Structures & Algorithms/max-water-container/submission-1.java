class Solution {
    public int maxArea(int[] heights) {
        int maxWater = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                maxWater = Math.max(maxWater, (j-i)*Math.min(heights[i],heights[j]));
            }
        }
        return maxWater;
    }
}
