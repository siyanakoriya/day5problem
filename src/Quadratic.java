
package functions;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,b,c,delta,sqrt,x1,x2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number : ");
        a=sc.nextInt();

        System.out.println("Enter number : ");
        b=sc.nextInt();

        System.out.println("Enter number : ");
        c=sc.nextInt();

        delta=b*b-4*a*c;
        System.out.println("Delta :"+delta);

        sqrt=Math.sqrt(delta);
        System.out.println("Square root of delta :"+sqrt);

        x1=(-b+sqrt)/(2*a);
        System.out.println("Square root of x1 :"+x1);

        x2=(-b-sqrt)/(2*a);
        System.out.println("Square root of x2 :"+x2);

    }

}