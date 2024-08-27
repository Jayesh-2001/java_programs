/* it's possible to modify the data in case of 
 ListIterator */

package Logic_problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3 {

   public static void main(String[] args) {
      List<Integer> mylist = new ArrayList<>();
      mylist.add(10);
      mylist.add(20);
      mylist.add(30);
      mylist.add(40);

      System.out.println("Using ListIterator from the beginning");
      ListIterator ltr = mylist.listIterator(mylist.size());
      ltr.add(400); // using ListIterator we can add inside list
      // ltr.set(502); // not possible
      while (ltr.hasNext()) {
         System.out.println(ltr.next());
      }

      // ltr.set(500); // it will modify last element.

      System.out.println("Using ListIterator from the end");

      while (ltr.hasPrevious()) {
         System.out.println(ltr.previous());
      }
      ltr.set(5000);
      System.out.println("*********************");
      System.out.println("mylist is\t" + mylist);
   }

}
