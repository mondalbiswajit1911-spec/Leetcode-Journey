import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[arr1.length];
        int index = 0;

        // Add elements in arr2 order
        for (int num : arr2) {
            while (map.getOrDefault(num, 0) > 0) {
                ans[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        // Store remaining elements
        List<Integer> remaining = new ArrayList<>();

        for (int key : map.keySet()) {
            while (map.get(key) > 0) {
                remaining.add(key);
                map.put(key, map.get(key) - 1);
            }
        }

        Collections.sort(remaining);

        for (int num : remaining) {
            ans[index++] = num;
        }

        return ans;
    }
}