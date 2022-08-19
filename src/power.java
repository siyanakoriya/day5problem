

public class Powerof2 {
    static int power(int expo)
    {
        int power=1,i;
        for(i=0;i<=expo;i++)
        {
            power=power*2;
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int expo,power;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter exponential : ");
        expo=sc.nextInt();

        power=power(expo);

        String ans;
        System.out.println("Result is 2^"+expo+"=" +ans);

    }

}
