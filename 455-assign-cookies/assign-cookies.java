class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        // int gLen = g.length;
        // int sLen = s.length;
        // if(gLen >= sLen){
           
        //     for(int num: s){
        //         max =Math.max(max, num);
        //     }
        // }
        // else if(gLen < sLen){
        //     for(int i = 0; i<gLen;i++){
        //         for(int j =0;j<sLen;j++){
        //          max =Math.max(max, s[j]);
        //         }
        //     }
        // }
        // return max;
        int child = 0;
        int cookie = 0;
        int count = 0;

        while (child < g.length && cookie < s.length) {

            if (s[cookie] >= g[child]) {
                // Cookie can satisfy this child
                count++;
                child++;
                cookie++;
            } else {
                // Cookie is too small
                cookie++;
            }
        }

        return count;
    }
}