class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0){
            return 0;
        }

        int sign = 1;
        int index = 0;
        long result = 0;

        if (s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = s.charAt(index) == '-' ? -1 :1;
            index++;
        }
        
        while (index < s.length()){
            char c = s.charAt(index);

            if (c < '0' || c > '9'){
                break;
            }

            result = result * 10 + (c - '0');

            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;

        }
        return (int) (result*sign);
    }
}