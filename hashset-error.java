import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SetExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter t");
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        HashSet<String> set = new HashSet();
        int count =0;
        System.out.println("Enter strings");
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        for (int i = 0; i < t; i++)
        {
         
            if (set.contains(pair_left[i])&&set.contains(pair_right[i]))
          {
                set.add(pair_left[i]);
               set.add(pair_right[i]);
                count++;
                System.out.println(count);
            }
            else
           {
               set.add(pair_left[i]);
               set.add(pair_right[i]);
               count++;
                System.out.println(count);      

           }
               
        }



    }
}