class Solution {
    public int largestInteger(int num) {
        //Arrays.sort(num);
        char[] arr = Integer.toString(num).toCharArray();

        for(int i = 0 ; i< arr.length; i++){
            int max_pos = i;
            for(int j =i+1 ; j<arr.length; j++){
                if(arr[j] > arr[max_pos] && (arr[i] - arr[j]) %2 == 0 ){
                  max_pos = j;  

                }
            }
            char temp = arr[i];
            arr[i] =arr[max_pos];
            arr[max_pos] = temp;
        }
        return Integer.parseInt(new String(arr));
    }
}