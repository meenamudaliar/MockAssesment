package samples;

import java.util.Scanner;

public class StringSubstring
{
 
    public static int subStrings(
                                String str, int n,
                                    int startIndex)
  {
    int count = 0, i = startIndex + 1;
    while (i <= n)
    {
      if (str.startsWith(str.substring(
                                 startIndex, i)))
      {
    	  String s=str.substring(startIndex,i);
    	  StringBuilder sb=new StringBuilder(s);
    	  if(s.length()>=2) {
    	  sb.reverse();
    	  String rev=sb.toString();
    	  
           if(s.equals(rev)) {
         System.out.println("Awesome");
           }
    	  }
count++;
      }
      else
        break;
      i++;
    }
    return count;
  }
 
 
  public static int countSubStrings(String str,
                                         int n)
  {
    int count = 0;
 
    for (int i = 0; i < n; i++)
    {
 
     
      if (str.charAt(i) == str.charAt(0))
        count += subStrings(str, n, i);
    }
 
    return count;
  }
 
  // Driver code
  public static void main(String[] args)
  {
	  int testcase;
	   String str ;
	   int k=0;
    Scanner sc=new Scanner(System.in);
    testcase=sc.nextInt();
    while(k<testcase) {
    str=sc.next();
    int n = str.length();
    System.out.println(countSubStrings(str, n));
    k++;
    }
  }
}
