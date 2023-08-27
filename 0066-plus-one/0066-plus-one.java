class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        if(digits.length==0){
            return digits;
        }
        digits[digits.length-1]+=1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 1; i <= digits.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}