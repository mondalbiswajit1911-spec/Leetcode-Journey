class ElementCounter{
    int val;
    int freq;

    public ElementCounter(int v, int f){
        val = v;
        freq = f;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        List<ElementCounter>list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new ElementCounter(
                entry.getKey(),
                entry.getValue()
            ));
        }
        Collections.sort(list, (a, b) -> b.freq - a.freq);

        int[] res = new int[k];

        for(int i = 0; i<k;i++){
            res[i] = list.get(i).val;
        }
        return res;
        
    }
}