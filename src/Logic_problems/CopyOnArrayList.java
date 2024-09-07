package Logic_problems;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayList {
   public static void main(String[] args) {
      List<Integer> list = new CopyOnWriteArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println(list);
      Iterator<Integer> itr = list.iterator();
      int i = 100;
      while (itr.hasNext()) {
         int num = itr.next();

         list.add(200);

      }
      System.out.println(list);
      list.remove(1);
      System.out.println(list);

   }
}
