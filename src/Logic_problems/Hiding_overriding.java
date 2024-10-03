package Logic_problems;

class Parent {
   static void disp() {
      System.out.println("Parent disp()");
   }
}

class Child extends Parent {
   static void disp() {
      System.out.println("Child disp()");
   }
}

public class Hiding_overriding {
   public static void main(String[] args) {
      Parent p = new Child();
      p.disp();

   }
}
