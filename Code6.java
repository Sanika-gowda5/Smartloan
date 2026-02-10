public class Code6{
    public static void main(String[] args) {
        String input = "swiss";
        findFirst(input);
    }

    public static void findFirst(String s) {
        // Step 1: Create an array to store counts of all 256 ASCII characters
        int[] counts = new int[256];

        // First pass: Fill the frequency array
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }

        // Step 2: Second pass to find the first character with count 1
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (counts[ch] == 1) {
                System.out.println("Input: (" + s + ")");
                System.out.println("Output: " + ch);
                found = true;
                break; // Stop at the very first one we find
            }
        }

        if (!found) {
            System.out.println("Output: None");
        }
    }
}