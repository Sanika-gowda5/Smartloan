public class Code2 {
    public static void main(String[] args) {
        String input = "madam";
        
        if (isPalindrome(input)) {
            System.out.println("Input: (" + input + ")");
            System.out.println("Output: palindrome");
        } else {
            System.out.println("Output: not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip spaces if they exist
            while (left < right && s.charAt(left) == ' ') left++;
            while (left < right && s.charAt(right) == ' ') right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}