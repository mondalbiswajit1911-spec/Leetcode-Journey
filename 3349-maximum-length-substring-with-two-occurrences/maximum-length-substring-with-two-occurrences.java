class Solution {
    public int maximumLengthSubstring(String s) {
         Map<Character, Integer> map = new HashMap<>();
        int maxlen =0;
        int left = 0;

        for(int right =0 ; right < s.length();right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0) +1);
            while(map.get(s.charAt(right))>2){
                int val = map.get(s.charAt(left)) -1;
                map.put(s.charAt(left), val);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}