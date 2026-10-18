class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // Count frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find common elements using nums2
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                res.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}