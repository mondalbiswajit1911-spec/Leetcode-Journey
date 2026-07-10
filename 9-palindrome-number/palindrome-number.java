class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int n=x,
        r=0;
        while(x!=0){
            int dig = x%10;
            r = r*10+dig;
            x = x/10;
        }
        // if(n==r){
        //     return true;
        // }
        return n==r;
    }
}