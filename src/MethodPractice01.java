import java.util.Scanner;

public class MethodPractice01 {

    //戻り値をString型にしてみる
//    public static String isLeapYear(int num) {
//        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
//            return "閏年です";
//        } else {
//            return "閏年ではありません";
//        }
//    }
//    public static void main(String[] args) {
//        System.out.print("西暦： ");
//        var sc = new Scanner(System.in);
//        var s1 = sc.nextLine();
//        var s2 = Integer.parseInt(s1);
//
//        var result = isLeapYear(s2);
//        System.out.println(result);
//
//        sc.close();
//    }

    //戻り値をboolean型とした時
    public static boolean isLeapYear(int num) {
        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("""
                閏年判定プログラム
                true:閏年である
                false:閏年ではない
                ―→""");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        System.out.println(isLeapYear(s2));

        sc.close();
    }
}
