import java.util.Scanner;

public class MethodPractice06 {
    public static boolean isPalindrome(String str) {
        String beforestr = str;
        StringBuilder afterstr = new StringBuilder(beforestr).reverse();
        var s2 = afterstr.toString();

        return str.equals(s2);
    }

    public static void main(String[] args) {
        System.out.print("文字： ");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.println(isPalindrome(s1));

        sc.close();
    }

}
