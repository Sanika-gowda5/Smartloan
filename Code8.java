public class Code8{
    public static void main(String[] args) {
        String input = "java is extreamlly powerful";
        findLongest(input);
    }

    public static void findLongest(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("None");
            return;
        }

        String longestWord = "";
        StringBuilder currentWord = new StringBuilder();
        
        // Add a space at the end to ensure the last word is processed
        String text = s + " "; 

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                // We hit a space, meaning the current word is finished
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                // Reset current word for the next iteration
                currentWord.setLength(0);
            }
        }

        System.out.println("Sample Input: (" + s + ")");
        System.out.println("Sample Output: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}