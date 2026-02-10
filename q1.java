package DSAonline.DAY1;
import java.util.*;
public class q1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++)
            ar[i]=sc.nextInt();

        System.out.println("Input Array:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i]+"\t");

    }
}
