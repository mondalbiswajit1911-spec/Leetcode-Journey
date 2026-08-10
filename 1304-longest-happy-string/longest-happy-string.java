class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int c_a = 0,
            c_b = 0,
            c_c = 0;
        StringBuilder res = new StringBuilder();
        while(true){
            if(a > 0 && (
                (a>=c && a>=b && c_a < 2) ||
                (c_b == 2 && b >= a && a >= c) ||
                (c_c == 2 && c >= a && a >= b)
            )
            ){
                res.append('a');
                c_a = c_a +1;
                c_b =0;
                c_c = 0;

                a = a-1;

            }else if(b > 0 && (
                (b>=a && b>=c && c_b < 2) ||
                (c_a == 2 && a >= b && b >= c) ||
                (c_c == 2 && c >= b && b >= a)
            )){
                res.append('b');
                c_b = c_b +1;
                c_a =0;
                c_c = 0;

                b = b-1;

            }else if(c > 0 && (
                (c>=b && c>=a && c_c < 2) ||
                (c_a == 2 && a >= c && c >= b) ||
                (c_b == 2 && b >= c && c>= a)
            )){
                res.append('c');
                c_c = c_c +1;
                c_a =0;
                c_b = 0;

                c = c-1;

            }else{
                break;
            }
        }  
        return res.toString();  
    }
}