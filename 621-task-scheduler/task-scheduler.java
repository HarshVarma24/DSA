class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks)
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : map.values())
            pq.add(freq);

        int time = 0;

        while (!pq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int cycle = n + 1;
            for (int i = 0; i < cycle; i++) {
                if (!pq.isEmpty()) {
                    int freq = pq.poll();   
                    freq--;
                    if (freq > 0) list.add(freq);
                }
                time++;   
                if (pq.isEmpty() && list.isEmpty())
                    break;   
            }
            for (int f : list)
                pq.add(f);
        }

        return time;
    }
}
