class Solution {
    public int heightChecker(int[] heights) {
        int[] newArray = heights.clone();
        int count = 0;
        Arrays.sort(newArray);
        for(int i =0 ; i< heights.length; i++){
            if(heights[i] != newArray[i]){
                count++;
            }
        }
        return count;

    }
}