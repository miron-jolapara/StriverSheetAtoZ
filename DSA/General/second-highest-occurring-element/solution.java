class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxFreq = 0, secondFreq = 0;
        int result = -1;

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (freq > maxFreq) {
                secondFreq = maxFreq;
                maxFreq = freq;
            } else if (freq > secondFreq && freq < maxFreq) {
                secondFreq = freq;
            }
        }

        if (secondFreq == 0)
            return -1;

        for (int num : map.keySet()) {
            if (map.get(num) == secondFreq) {
                if (result == -1 || num < result)
                    result = num;
            }
        }

        return result;
    }
}