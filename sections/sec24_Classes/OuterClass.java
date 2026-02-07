package sections.sec24_Classes;

public class OuterClass {
     public int number = 5;

     public void hey() {
         System.out.println("Hey from OuterClass");
     }

     public class InnerClass {
         public int num = 10;

         public void greet() {
              System.out.println("Hello from InnerClass");
         }
     }

     public static class StaticInnerClass {
          public void salude() {
               System.out.println("Heyyy from StaticInnerClass");
          }
     }
}
