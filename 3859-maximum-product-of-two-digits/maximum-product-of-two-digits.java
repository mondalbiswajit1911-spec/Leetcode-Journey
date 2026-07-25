class Solution {
    public int maxProduct(int n) {
        List<Integer> digit = new ArrayList<>();

        while(n > 0){
            digit.add(n%10);
            n = n/10;
        }
        int productmax =0;
        for(int i = 0; i<digit.size();i++){
            for(int j =i+1;j<digit.size();j++){

                productmax = Math.max(productmax, digit.get(i) * digit.get(j));
            }
        }
        return productmax;
    }
}