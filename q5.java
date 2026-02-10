package DSAonline.DAY1;
import java.util.*;
public class q5 {
    static void main() {

                Scanner sc = new Scanner(System.in);

                int[][] mat = new int[3][3];
                int sum = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        mat[i][j] = sc.nextInt();
                        sum += mat[i][j];
                    }
                }

                System.out.println(sum);
            }
        }

