package problems.beginner;

public class LeetcodeOffer58II {
    public static  String reverseLeftWords(String s, int n) {
        System.out.println(s.substring(0, n));
        System.out.println(s.substring(n));
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        reverseLeftWords("abcdefg", 2);
    }
}
