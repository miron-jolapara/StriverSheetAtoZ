import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            int value;

            if (nums1[i] < nums2[j]) {
                value = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                value = nums2[j++];
            } else {
                value = nums1[i];
                i++;
                j++;
            }

            if (result.isEmpty() || result.get(result.size() - 1) != value) {
                result.add(value);
            }
        }

        while (i < nums1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }

        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}