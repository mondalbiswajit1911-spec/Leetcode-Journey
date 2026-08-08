class Solution {
    public int lastStoneWeight(int[] stones) {

       PriorityQueue<Integer> max_heap =
            new PriorityQueue<>(Collections.reverseOrder());

        // Put all stones into max heap
        for (int stone : stones) {
            max_heap.add(stone);
        }

        while(max_heap.size()> 1){
            //list.sort();
            //Collections.sort(list);
            int last = max_heap.remove();
            int second_last = max_heap.remove();

            if(last > second_last){
                max_heap.add(last - second_last);
            }

            // if(max_heap.size()==1){
            //     return max_heap.peek();
            // }
        }
         return max_heap.isEmpty() ? 0 : max_heap.peek();
    }
}