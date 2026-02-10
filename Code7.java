public class Code7{
    public static void main(String[] args) {
        String input1 = "aaabbcccc";
        String input2 = "abcd";

        System.out.println("Input: " + input1 + " -> Output: " + compress(input1));
        System.out.println("Input: " + input2 + " -> Output: " + compress(input2));
    }

    public static String compress(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check if the next character is the same as current
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Append character
                sb.append(s.charAt(i));
                
                // Only append count if it's greater than 1
                if (count > 1) {
                    sb.append(count);
                }
                
                // Reset count for the next unique character
                count = 1;
            }
        }

        return sb.toString();
    }
}