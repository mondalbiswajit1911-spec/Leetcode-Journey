
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        if (s.length() < 10)
            return new ArrayList<>();

        int k = 10;

        // Robin-Karp -- Rolling Hash

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        int rep = 0;
        int highestPower = (int) Math.pow(4, k - 1);

        // First window
        for (int i = 0; i < k; i++) {
            rep = rep * 4 + map.get(s.charAt(i));
        }

        seen.add(rep);

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            rep = (rep - highestPower * map.get(s.charAt(i - k))) * 4
                    + map.get(s.charAt(i));

            if (seen.contains(rep)) {
                result.add(s.substring(i - k + 1, i + 1));
            }

            seen.add(rep);
        }

        return new ArrayList<>(result);
    }
}