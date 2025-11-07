class Pair {
    public int key;
    public int frequency;
    public Pair(int key, int frequency) {
        this.key = key;
        this.frequency = frequency;
    }

}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
            (p1, p2) -> Integer.compare(p2.frequency, p1.frequency)
        );
        for (int i: map.keySet()) {
            pq.add(new Pair(i, map.get(i)));
        }

        int arr[] = new int[k];
        for (int i=0; i < k; ++i) {
            arr[i] = pq.poll().key;
        }
        return arr;

    }
}