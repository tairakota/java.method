import java.util.Scanner;

public class MethodPractice09 {
    public static int getIndex(int[] arrays, int mx, int mn, int a) {
        if (mx >= mn) {
            int mid = (mx + mn) / 2;

            if (arrays[mid] == a) {
                return mid;
            }
            else if (arrays[mid] > a) {
                return getIndex(arrays, mid - 1, mn, a);
            }
            else {
                return getIndex(arrays, mx, mid + 1, a);
            }
        } else {
            return -1;
        }
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

        var lists = MethodPractice08.sortArray(list);
        System.out.println("昇順に並び替えられました！");

        System.out.print("探したい数値を入力してね： ");
        var se1 = sc.nextLine();
        var se2 = Integer.parseInt(se1);

        System.out.println(getIndex(lists,lists.length,0,se2) + 1 + "番目");

        sc.close();
    }
}
