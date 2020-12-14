import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int flag=0;
        if(s1.length()==s2.length())
        {

            for (int i=0;i<s1.length();i++)
            {
                int localcount = 0;
                if (map1.containsKey(s1.charAt(i)))
                {
                    localcount=map1.get(s1.charAt(i));
//                    map.put(s1.charAt(i),localcount+1);
                }
                map1.put(s1.charAt(i), (localcount + 1));

            }

        }
        else
            flag=1;
        for (int i=0;i<s2.length();i++)
        {
            int localcount = 0;
            if (map2.containsKey(s2.charAt(i)))
            {
                localcount=map2.get(s2.charAt(i));
//                    map.put(s1.charAt(i),localcount+1);
            }
            map2.put(s2.charAt(i), (localcount + 1));

        }
        if(flag==0&&map1.equals(map2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");


        }
    }


