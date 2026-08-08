class Solution {
    public int lastStoneWeight(int[] stones) {

        List<Integer> list = new ArrayList<>();

        for (int num : stones) {
          list.add(num);
        }

        while(list.size()> 1){
            //list.sort();
            Collections.sort(list);
            int last = list.remove(list.size()-1);
            int second_last = list.remove(list.size()-1);

            if(last > second_last){
                list.add(last - second_last);
            }

            // if(list.size()==1){
            //     return list.get(0);
            // }
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
}