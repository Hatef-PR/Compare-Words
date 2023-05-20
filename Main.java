import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word: ");
        String word1 = input.nextLine();
        System.out.println("Please enter second word: ");
        String word2 = input.nextLine();
        System.out.println(compareWords(word1, word2));
    }
    // This method checks two strings are exactly same
    public static boolean compareWords(String a, String b) {
        boolean flag = true;
        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}