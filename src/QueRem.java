
package logical;
        import java.util.Scanner;

public class QueRem{

    public static void main(String[] args) {
        // TODO Auto-generated method stub2
        int n1,n2,q,rem;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number1 : ");
        n1=sc.nextInt();

        System.out.println("Enter number2 : ");
        n2=sc.nextInt();

        q=n1/n2;
        System.out.println("Quotient is : " +q);

        rem=n1%n2;
        System.out.println("Remainder is : "+rem);

    }

}