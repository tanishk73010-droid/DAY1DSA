package DSAonline.DAY1;
import java.util.*;

public class q3 {
    static void main() {


                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] * arr[i] + " ");
                }
            }
        }

