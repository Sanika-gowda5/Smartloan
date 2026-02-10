public class Code10{
    public static void main(String[] args) {
        int limit = 50000;

        // --- Program 1: Using String Concatenation ---
        long startTime1 = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i <= limit; i++) {
            str += i; 
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String (+=) Time: " + (endTime1 - startTime1) + " ms");

        // --- Program 2: Using StringBuilder ---
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= limit; i++) {
            sb.append(i);
        }
        String result = sb.toString();
        long endTime2 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ms");
    }
}