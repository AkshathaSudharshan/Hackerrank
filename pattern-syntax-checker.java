import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        while (n>0)
        {
            System.out.println("Enter Regex");
            String regex = scan.next();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException exception)
            {
                System.out.println("Invalid");
//                System.exit(1);
            }

            n--;
        }

    }
}
