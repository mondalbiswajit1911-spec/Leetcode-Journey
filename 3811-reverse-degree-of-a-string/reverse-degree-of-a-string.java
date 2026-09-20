class Solution {
    public int reverseDegree(String s) {
    int result = 0;

    for (int i =0;i<s.length();i++) {
        char ch = s.charAt(i);
        int reverseValue = 'z' - ch + 1;
        int indx = i + 1;

        result =result + ( reverseValue * indx);

    }
    return result;
    }
}