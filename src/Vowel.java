
package logical;

        import java.util.*;

public class Vowel {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char vow[]={'a','e','i','o','u'};
        char alpha;
        int i;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter alphabet : ");
        alpha=sc.next().charAt(0);

        for(i=0;i<=vow.length;i++)
        {
            if(alpha==vow[i])
            {
                System.out.println(alpha+" is a vowel.");
            }
            else
            {
                System.out.println(alpha+" is a consonant.");
            }
        }
    }
}