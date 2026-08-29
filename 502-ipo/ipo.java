class ProjectDetails{
    int profit;
    int capital;

    public ProjectDetails(int p, int c){
        this.profit = p;
        this.capital = c;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int cc = w;
        // List<Integer> profitList = new ArrayList<>();
        // List<Integer> capitalList = new ArrayList<>();
        ProjectDetails[] pjs = new ProjectDetails[profits.length];

        // for(int p: profits){
        //     profitList.add(p);
        // }
        for(int i = 0; i< profits.length;i++){
            pjs[i] = new ProjectDetails(profits[i], capital[i]);
        }
        // for(int c: capital){
        //     capitalList.add(c);
        // }

        Arrays.sort(pjs, (a, b) -> a.capital - b.capital);
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());


        // choose k project
        int p = 0;
        for(int proj =0; proj<k;proj++){
            int maxProfitsIdx = -1;
            while(p < pjs.length && cc>= pjs[p].capital){
                maxheap.add(pjs[p].profit);
                p++;
            }

            // for(int c =0; c< capitalList.size();c++){
            //     if(capitalList.get(c) <= cc){
            //         if(maxProfitsIdx == -1){
            //             maxProfitsIdx = c;
            //             continue;
            //         }

            //         if(profitList.get(c) > profitList.get(maxProfitsIdx)){
            //             maxProfitsIdx = c;
            //         }
            //     }
            // }

            if(maxheap.size() == 0){
                return cc;
            }
            cc = cc + maxheap.poll();

            // profitList.remove(maxProfitsIdx);
            // capitalList.remove(maxProfitsIdx);

        }


        return cc;
    }
}