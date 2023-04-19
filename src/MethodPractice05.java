import java.util.Scanner;

public class MethodPractice05 {

    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.print("配列数を入力してね： ");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        var array = new int[s2];

        for(int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + "個目の数字： ");
            var sd1 = sc.nextLine();
            var sd2 = Integer.parseInt(sd1);
            array[i] = sd2;
        }

        System.out.println(findMax(array));

        sc.close();

    }
}
