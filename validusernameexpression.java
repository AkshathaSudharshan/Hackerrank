import java.util.*;
import java.util.regex.Pattern;

public class ValidRegex {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter username");
            String uname = scan.next();
            String regex = "^[A-Za-z]\\w{5,29}$";
            boolean isMatch = Pattern.matches(regex,uname);
            System.out.println(isMatch);
        }


    }
}
