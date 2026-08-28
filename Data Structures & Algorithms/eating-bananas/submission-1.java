class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = 1;

        while(l <= r) {
            int k = (l + r) / 2;
            int totalHours = 0;
            for(int pile : piles) {
                totalHours += (int) Math.ceil((double) pile / k);
            }        

            if(totalHours <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}
