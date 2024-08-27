package Logic_problems;

import java.util.Scanner;

public class MidOdd {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter word");
      String str=sc.next();
      char ch[]=str.toCharArray();
      int length=str.length();
      int mid =length/2;
      if(length%2!=0) {
    	  System.out.println(ch[mid]);
      }
      else {
    	  for(int i=1;i<length-1;i++) {
    		  System.out.println(ch[i]);
    	  }
      }
   }
}
