
class Solution {
    public long countSubstrings(String s) {
        long[] freq = new long[1 << 10];
        freq[0] = 1;

        int mask = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - 'a';
            mask ^= (1 << bit);

            // Zero characters with odd frequency
            count += freq[mask];

            // Exactly one character with odd frequency
            for (int j = 0; j < 10; j++) {
                count += freq[mask ^ (1 << j)];
            }

            freq[mask]++;
        }

        return count;
    }
}
