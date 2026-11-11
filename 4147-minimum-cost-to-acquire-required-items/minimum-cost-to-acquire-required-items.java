class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1== 0 && need2 == 0){
            return 0;
        }
        long nn = Math.min(need1, need2);
        long total_cost = nn * Math.min(costBoth, cost1 + cost2);
        if (need1 > need2){
          total_cost += (need1 - nn) * Math.min(cost1, costBoth);
        }
        else{
        total_cost += (need2 - nn) * Math.min(cost2, costBoth);
        }
        
       return total_cost;
        
        //return 0;
    }
}