
import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int x : arr1) {
            int left = 0;
            int right = arr2.length;
            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr2[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            boolean valid = true;
            if (left < arr2.length &&
                Math.abs(arr2[left] - x) <= d) {
                valid = false;
            }
            if (left > 0 &&
                Math.abs(arr2[left - 1] - x) <= d) {
                valid = false;
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}




// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//         int count = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             boolean valid = true;

//             for (int j = 0; j < arr2.length; j++) {
//                 if (Math.abs(arr1[i] - arr2[j]) <= d) {
//                     valid = false;
//                     break;
//                 }
//             }

//             if (valid) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }
