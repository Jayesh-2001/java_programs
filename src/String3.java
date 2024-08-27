public class String3 {
   public static void main(String[] args) {
      String arr[] = { "abc", "rre", "iuw", "bgs", "odn" };
      int l = arr.length;
      String temp;

      for (int i = 0; i < l; i++) {
         for (int j = 0; j < l-i-1; j++) {
            if (arr[j].compareTo(arr[j+1])>0) {
               temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
         l--;
      }
      for (String str : arr) {
         System.out.println(str);
      }


   }
}
