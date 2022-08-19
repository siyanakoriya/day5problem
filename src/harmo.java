
import java.util.Scanner;

public class harmo {
    private static double result;

    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        double result = 0.0;

        for (int i = num; i > 0; i--) {
            result = result + (double) 1 / i;
            System.out.println(result + ",");
        }
    }
}
//   Harmonic number for 5 values---
//   H1=1
//   H2=H1+1/2
//   H3=H2+1/3
//   H4=H3+1/4
//   H5=H4+1/5
