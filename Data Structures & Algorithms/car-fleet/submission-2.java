class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> stack = new Stack<>();
        int[][] pair = new int[speed.length][2];
        for(int i = 0; i < speed.length; i++) {
            pair[i] = new int[]{position[i], speed[i]};
        } 
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for(int i = 0; i < pair.length; i++) {
            stack.push((float)(target - pair[i][0]) / pair[i][1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2))
                stack.pop();
        }
        return stack.size();
    }
}
