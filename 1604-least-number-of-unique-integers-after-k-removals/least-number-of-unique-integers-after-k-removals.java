class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[][] list = new int[map.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list[i][0] = entry.getKey();
            list[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(list, (a, b) -> a[1] -b[1]);

        i =0;
        while(i<list.length){
            k = k-list[i][1];
            if(k<0){
                break;
            }
            i++;
        }
        return list.length -i;
    }
}