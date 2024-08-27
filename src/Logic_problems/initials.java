package Logic_problems;

public class initials {
   public static void main(String[] args) {
      String name = "Electrical And Electronics Engineering";

      String words[] = name.split(" ");
      StringBuilder initials = new StringBuilder();

      for (String w : words) {
         if (!w.isEmpty()) {
            if (w.equalsIgnoreCase("of") || w.equalsIgnoreCase("and") || w.equalsIgnoreCase("for")) {
               continue;
            } else {
               initials.append(w.charAt(0));
            }
         }
      }
      System.out.println(initials);
   }
}
