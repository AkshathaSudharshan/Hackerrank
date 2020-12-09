import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
        str = str.trim();
        String[] arrOfstr = str.split("[!,?._'@ \\ ]+");
        int length = arrOfstr.length;
        System.out.println(length);
        for(String arr:arrOfstr)
            System.out.println(arr);
        // Write your code here.
        scan.close();
    }
}
