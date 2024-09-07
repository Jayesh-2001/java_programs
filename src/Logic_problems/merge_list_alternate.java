package Logic_problems;

import java.util.ArrayList;
import java.util.List;

public class merge_list_alternate {
   public static void main(String[] args) {
      List<String> list1 = new ArrayList<>();
      List<String> list2 = new ArrayList<>();
      List<String> merged = new ArrayList<>();

      list1.add("1");
      list1.add("2");
      list1.add("3");
      list1.add("4");
      list1.add("5");

      list2.add("a");
      list2.add("b");
      list2.add("c");
      list2.add("d");
      list2.add("e");
      list2.add("f");
      list2.add("g");
      
      int size = Math.min(list1.size(), list2.size());

      for (int i = 0; i < size; i++) {
         merged.add(list1.get(i));
         merged.add(list2.get(i));
      }
      for (int i = size; i < list1.size(); i++) {
         merged.add(list1.get(i));
      }
      for (int i = size; i < list2.size(); i++) {
         merged.add(list2.get(i));
      }

      System.out.println(merged);
   }
}
