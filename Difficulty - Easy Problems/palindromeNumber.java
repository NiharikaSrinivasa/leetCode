class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int isPalindromeNumber = 121;
        boolean result = solution.isPalindrome(isPalindromeNumber);
        if (result == true) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is Not Palindrome");
        }
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        if (x < 0) {
            return false;
        }

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}