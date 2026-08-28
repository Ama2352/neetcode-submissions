class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int remaining = target - numbers[i];
            if(map.containsKey(remaining)) {
                int index1 = map.get(remaining) + 1;
                int index2 = i + 1;
                if(index1 < index2) return new int[]{index1, index2};
                else return new int[]{index2, index1};
            }
            map.put(numbers[i], i);
        }
       
        return new int[0];
    }
}
