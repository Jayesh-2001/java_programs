package Logic_problems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class MyNum implements Serializable {
   private int num;

   MyNum(int num) {
      this.num = num;
   }

   @Override
   public String toString() {
      return "MyNum [num=" + num + "]";
   }
}

public class Q05_Demo {

   public static void main(String[] args) {
      MyNum m1 = new MyNum(10);
      MyNum m2 = new MyNum(20);
      MyNum m3 = new MyNum(30);
      MyNum m4 = new MyNum(40);

      List<MyNum> list = new ArrayList<MyNum>();
      list.add(m1);
      list.add(m2);
      list.add(m3);
      list.add(m4);

      try {
         FileOutputStream fos = new FileOutputStream("D:\\happy.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(list);
         System.out.println("Object Store SucessFully");
      } catch (IOException e) {
         e.printStackTrace();
      }
      list = null;
      try {

         FileInputStream fis = new FileInputStream("D:\\happy.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         list = (List<MyNum>)ois.readObject();
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
      }

      ListIterator itr = list.listIterator();

      while (itr.hasPrevious()) {
         System.out.println(itr.previous());
      }

   }

}
