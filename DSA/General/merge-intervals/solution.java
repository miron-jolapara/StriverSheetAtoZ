class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> interval : intervals) {
            if (result.isEmpty() || result.get(result.size() - 1).get(1) < interval.get(0)) {
                result.add(new ArrayList<>(interval));
            } else {
                List<Integer> last = result.get(result.size() - 1);
                last.set(1, Math.max(last.get(1), interval.get(1)));
            }
        }

        return result;
    }
}