package Logic_problems;

public class time_conversion {
   public static String timeConversion(String s) {
      // Write your code here
      String arr[] = s.split(":");

      String ampm = arr[2].substring(2);

      int hh = Integer.parseInt(arr[0]);
      int mm = Integer.parseInt(arr[1]);
      int ss = Integer.parseInt(arr[2].substring(0, 2));

      if (ampm.equalsIgnoreCase("AM") && hh == 12) {
         hh = 00;
      } else if (ampm.equalsIgnoreCase("PM")) {
         if (hh != 12) {
            hh += 12;
         }
      }

      String output = String.format("%02d:%02d:%02d", hh, mm, ss);
      return output;

   }
   public static void main(String[] args) {
      System.out.println(timeConversion("07:05:45PM"));
   }
}
