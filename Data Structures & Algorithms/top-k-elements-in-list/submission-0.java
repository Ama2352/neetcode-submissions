class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(freq.values());
        Collections.sort(list);
        List<Integer> lastK = list.subList(list.size() - k, list.size());
        int[] res = new int[k];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(lastK.contains(value) && index < k) {
                res[index] = key;
                index++;
            }
        }
        return res;
    }
}
