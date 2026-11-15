class Solution {
    public int numOfSubarrays(int[] arr) {
         int MOD = 1000000007;

        long even = 1;
        long odd = 0;
        long count = 0;

        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 != 0) {
                count += even;
                odd++;
            } else {
                count += odd;
                even++;
            }

            count %= MOD;
        }

        return (int) count;
        // int count = 0;
        // int MOD = 1000000007;
        // for(int i = 0; i<arr.length;i++){
        //     int sum = 0;
        //     for(int j = i; j<arr.length;j++){
        //         sum = sum + arr[j];
        //         if(sum % 2 != 0){
        //             count++;
        //             count = count % MOD;
        //         }
        //     }
        // }
        // return count;

    }
}