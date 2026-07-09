class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i=0,
        j=0;
        Map<Character, Integer> map = new HashMap<>();

        while(j< s.length()){
            char c= s.charAt(j);

            if(map.containsKey(c)){
               // set.remove(s.charAt(i));
               if(map.get(c) >= i){
                i = map.get(c) +1;
               }
                //i++;
            }
            map.put(c, j);
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}