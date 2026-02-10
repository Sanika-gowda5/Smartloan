public class Code3{
    public static void main(String[] args) {
        String input = "programming";
        printFrequencyVertical(input);
    }

    public static void printFrequencyVertical(String s) {
        // Step 1: Count occurrences using an ASCII frequency array
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Only count if it's not a space
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        // Step 2: Print vertically in order of appearance
        boolean[] printed = new boolean[256];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Skip spaces and characters we've already printed
            if (ch != ' ' && !printed[ch]) {
                System.out.println(ch + "->" + freq[ch]);
                printed[ch] = true; 
            }
        }
    }
}