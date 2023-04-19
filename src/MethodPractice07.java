import java.util.Calendar;
import java.util.Scanner;

public class MethodPractice07 {

    public static int getAge(int year, int month, int day) {
        Calendar cl = Calendar.getInstance();
        var nowYear = cl.get(Calendar.YEAR);
        var nowMonth = cl.get(Calendar.MONTH) + 1;
        var nowDate = cl.get(Calendar.DATE);

        var age = nowYear - year;

        if(nowMonth < month || (nowMonth == month && nowDate < day)) {
            age = age - 1;
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.print("誕生年：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);
        System.out.print("誕生月：");
        var s2 = sc.nextLine();
        var num2 = Integer.parseInt(s2);
        System.out.print("誕生日：");
        var s3 = sc.nextLine();
        var num3 = Integer.parseInt(s3);

        System.out.println(getAge(num1, num2, num3));
        sc.close();
    }
}
