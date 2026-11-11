class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (freq > maxFreq || (freq == maxFreq && num < result)) {
                maxFreq = freq;
                result = num;
            }
        }

        return result;
    }
}