public class Code9{
    public static void main(String[] args) {
        String input = "test@gmail.com";
        
        if (isValidEmail(input)) {
            System.out.println("Sample Input: " + input);
            System.out.println("Sample Output: valid");
        } else {
            System.out.println("Sample Input: " + input);
            System.out.println("Sample Output: invalid");
        }
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) return false;

        int atCount = 0;
        int dotCount = 0;
        int atIndex = -1;
        boolean hasSpace = false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            if (ch == ' ') {
                hasSpace = true;
                break; // Rule 4: No spaces allowed
            }
            if (ch == '@') {
                atCount++;
                atIndex = i;
            }
            if (ch == '.') {
                dotCount++;
            }
        }

        // Rule 1: Exactly one @
        if (atCount != 1) return false;

        // Rule 2: At least one dot
        if (dotCount < 1) return false;

        // Rule 3: At least 1 character before @
        if (atIndex < 1) return false;

        // Rule 4: Check if space was found
        if (hasSpace) return false;

        return true;
    }
}