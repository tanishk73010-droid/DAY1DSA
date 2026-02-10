package DSAonline.DAY1;
import java.util.*;

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += mat[i][j];
            }

            System.out.println(sum);
        }
    }
}
