public class Code4{
    public static void main(String[] args) {
        String input = "banana";
        String result = removeDupes(input);
        
        System.out.println("Input:  " + input);
        System.out.println("Output: " + result);
    }

    public static String removeDupes(String s) {
        // StringBuilder is more efficient than String concatenation in loops
        StringBuilder sb = new StringBuilder();
        
        // Boolean array to track seen characters (ASCII range)
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If we haven't seen this character yet
            if (!seen[ch]) {
                sb.append(ch);   // Add it to our output
                seen[ch] = true; // Mark it as seen
            }
        }

        return sb.toString();
    }
}