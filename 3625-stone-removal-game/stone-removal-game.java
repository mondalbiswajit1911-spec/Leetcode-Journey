class Solution {
    public boolean canAliceWin(int n) {
        int take = 10;
        int stape = 0;
        while(n >= take){
            n= n- take;
            take--;
            stape++;
        }
        if(stape % 2 == 0){
            return false;
        }
        return true;
    }
}