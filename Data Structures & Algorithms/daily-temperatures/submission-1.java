class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // int[2]: [temp, idx]
        for(int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] top = stack.pop();
                int idx = top[1];
                res[idx] = i - idx;
            } 
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    } 
}
