import java.util.Scanner;

public class MethodPractice03 {
    public static boolean isPrime(int num) {
        // 2未満の数は素数ではない
        if (num < 2) {
            return false;
        }
        // 2は素数である
        if (num == 2) {
            return true;
        }
        // 偶数は素数ではない
        if (num % 2 == 0) {
            return false;
        }
        // nを3からsqrt(n)までの奇数で割り切れないか判定する
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("""
                素数判定プログラム
                true:素数である
                false:素数ではない
                ―→ """);
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        System.out.println(isPrime(s2));

        sc.close();
    }

}
