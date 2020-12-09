import java.util.*;
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scan.next();
        str = str.trim();
        String[] arrOfstr = str.split("[!,?._'@ \\ ]+");
        for(int i=0;i< arrOfstr.length;i++)
            System.out.println(arrOfstr[i]);

    }
}
