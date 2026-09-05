class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        minHeap.add(new int[]{
            nums1[0]+ nums2[0],
            0,
            0
        });
        List<List<Integer>> res  = new ArrayList<>();
        int count=1;
        while(count <= k){
            int[] ele = minHeap.remove();

            int sum =ele[0],
            i = ele[1],
            j = ele[2];

            res.add(Arrays.asList(nums1[i], nums2[j]));

            if(i+1 < nums1.length){
                Pair<Integer,Integer> pair=new Pair<Integer,Integer>(i+1, j);
                if(!visited.contains(pair)){
                    minHeap.add(new int[]{
                        nums1[i+1] + nums2[j],
                        i+1,
                        j
                    });
                    visited.add(pair);
                }
            }
            if(j+1 < nums2.length){
                Pair<Integer,Integer> pair=new Pair<Integer,Integer>(i, j+1);
                if(!visited.contains(pair)){
                    minHeap.add(new int[]{
                        nums1[i] + nums2[j+1],
                        i,
                        j+1
                    });
                    visited.add(pair);
                }
            }
            count++;
        }
        return res;



        // List<List<Integer>> res = new ArrayList<>();

        // for(int i = 0; i< nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         List<Integer> temp = new ArrayList<>();
        //         temp.add(nums1[i]);
        //         temp.add(nums2[j]);
        //         res.add(temp);
        //     }
        // }
        // //sort
        // Collections.sort(res, (a, b) -> (a.get(0)+a.get(1)) - (b.get(0)+b.get(1)));

        // List<List<Integer>> out = new ArrayList<>();
        // for(int i=0;i<k;i++){
        //     out.add(res.get(i));
        // }
        // return out;
    }
}