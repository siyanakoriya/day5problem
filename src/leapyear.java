import java.util.Scanner;
public class leapyear {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int year;
        System.out.println("Enter year : ");

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println( year+" year is a leap year");
        else
            System.out.println(year+" year is not a leap year");
    }
}
