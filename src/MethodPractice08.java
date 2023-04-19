import java.util.Scanner;

public class MethodPractice08 {

    public static int[] sortArray(int[] array) {
        for(var i = 0; i < array.length; i++) {
            for(var j = array.length - 1; j > i; j--) {
                if(array[j] < array[j - 1]) {
                    var temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.print("配列数を入力してね： ");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = Integer.parseInt(s1);

        var list = new int[s2];

        for(int i = 0; i < list.length; i++) {
            System.out.print(i + 1 + "個目の数字： ");
            var sd1 = sc.nextLine();
            var sd2 = Integer.parseInt(sd1);
            list[i] = sd2;
        }
        list = sortArray(list);

        for(var i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        sc.close();
    }
}
