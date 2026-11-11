class Solution {
    public List<Character> frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b)))
                return Character.compare(a, b);

            return map.get(b) - map.get(a);
        });

        pq.addAll(map.keySet());

        List<Character> result = new ArrayList<>();

        while (!pq.isEmpty())
            result.add(pq.poll());

        return result;
    }
}