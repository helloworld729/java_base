class Solution {
    public static int[] plusOne(int[] digits) {
        int plus = 1;
        int length = digits.length;

        for(int i=length-1; i >= 0; i--){
            int current = digits[i];
            int sum = current + plus;
            if(sum < 10){
                digits[i] = sum;
                return digits;
            }else{
                digits[i] = sum % 10;
            }
        }
        int[] res={1};
        return res;
    }

    public static void main(String[] args) {
        int[] digit = {1, 3, 4, 2};
        System.out.println(plusOne(digit).toString());
    }
}