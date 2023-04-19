import java.util.Scanner;

public class MethodPractice02 {

    public static int getSum(int num) {
        if (num > 0) {
            return num * (num+1) / 2;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.print("数値： ");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        var sum = getSum(s2);
        System.out.println(sum);

        sc.close();
    }
}
