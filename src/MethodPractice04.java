import java.util.Scanner;

public class MethodPractice04 {

    public static int factorial(int num) {
        return num * num;
    }
    public static void main(String[] args) {
        System.out.print("数値： ");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        System.out.println(factorial(s2));

        sc.close();
    }
}
