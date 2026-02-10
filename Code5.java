public class Code5{
    public static void main(String[] args) {
        // Test Cases
        checkAnagram("listen", "silent");
        checkAnagram("Dormitory", "Dirty room");
    }

    public static void checkAnagram(String s1, String s2) {
        // Step 1: Remove spaces and convert to lowercase
        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("Input: (" + s1 + ", " + s2 + ") -> Output: Anagram");
        } else {
            System.out.println("Input: (" + s1 + ", " + s2 + ") -> Output: Not Anagram");
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] charCounts = new int[256];

        // Increment for first string, decrement for second
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i)]++;
            charCounts[s2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) return false;
        }

        return true;
    }
}