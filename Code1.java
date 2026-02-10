public class Code1 {
    public static void main(String[] args) {
        String input = "java is very powerful";
        String result = reverseWords(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + result);
    }

    public static String reverseWords(String s) {
        // Step 1: Convert to char array for manual manipulation
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Step 2: Reverse the entire array
        reverse(chars, 0, n - 1);

        // Step 3: Reverse each word in the reversed array
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            } else if (end == n - 1) { // Handle the last word
                reverse(chars, start, end);
            }
        }

        return new String(chars);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}