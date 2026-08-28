class Solution {

    class Node {
        int index;
        double distance;

        Node(int index, double distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingDouble(n -> n.distance));
        for(int i = 0; i < points.length; i++) {
            double dis = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            Node newNode = new Node(i, dis);
            minHeap.offer(newNode);
        }

        int[][] res = new int[k][2];
        int rowIndex = 0;

        for(int i = 0; i < k; i++) {
            Node closest = minHeap.poll();
            int x = points[closest.index][0];
            int y = points[closest.index][1];
            res[rowIndex][0] = x;
            res[rowIndex][1] = y;
            rowIndex++;
        }

        return res;
    }
}
