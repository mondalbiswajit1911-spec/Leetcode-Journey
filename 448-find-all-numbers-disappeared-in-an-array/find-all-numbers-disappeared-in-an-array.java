class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i]){
                int temp = nums[correctIdx];
                nums[correctIdx] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0 ; j<nums.length;j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
}