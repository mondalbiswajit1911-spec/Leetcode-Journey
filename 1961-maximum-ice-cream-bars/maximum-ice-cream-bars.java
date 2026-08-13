class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int[] ans  = new int[costs.length];
        ans[0] = costs[0];
        int index = 0;

        for(int i =1; i < costs.length;i++){
            ans[i] = ans[i-1] + costs[i];
        }
        boolean flag = false;
        for(int j =0 ; j < ans.length;j++){
            index = j;
            if(ans[j] > coins){
                flag = true;
                break;
            }
        }
        if(flag){
            return index;
        }else{
            return ans.length;
        }
    }
}