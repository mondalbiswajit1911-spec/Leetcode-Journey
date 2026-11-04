class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}

// class Solution {
//     public boolean isUgly(int n) {
//         int x = Integer.MAX_VALUE;
//         for(int i = 1; i<n/2;i++){
//             if(n % i == 0){
//                 if(i % 2 != 0){
//                     return true;
//                     //break;
//                 }
//             }
//         }
//         return false;
//     }
// }