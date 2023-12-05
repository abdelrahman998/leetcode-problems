public class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative, it cannot be a palindrome.
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int original = x;
        // Reversing the number.
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        // Comparing the original number with the reversed number.
        return original == reverse;
    }
}
