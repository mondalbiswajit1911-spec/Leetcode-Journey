class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]-b[0]);

        int right = Integer.MIN_VALUE;
        int resLeft = 0,
        resRight = Integer.MAX_VALUE;

        for(int i = 0; i< nums.size();i++){
            pq.add(new int[]{
                nums.get(i).get(0),
                i,
                0
            });
            right = Math.max(right, nums.get(i).get(0));
        }
        while(pq.size() == nums.size()){
            int[] ele = pq.poll();

            int left = ele[0],
            listIdx = ele[1],
            eleIdx = ele[2];

            if((right -left) < (resRight-resLeft)){
                resRight = right;
                resLeft = left;
            }
            int newEleIdx = eleIdx +1;
            if(newEleIdx < nums.get(listIdx).size()){
                int val = nums.get(listIdx).get(newEleIdx);
                right = Math.max(right, val);
                pq.add(new int[]{
                    val,
                    listIdx,
                    newEleIdx
                });
            }


        }
        return new int[]{
            resLeft,
            resRight
        };
    }
}