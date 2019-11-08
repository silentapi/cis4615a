/******************************************************************************
 *  Compilation:  javac R05_OBJ01_J.java
 *  Execution:    java R05_OBJ01_J
 *
 *  
 *
 ******************************************************************************/

public class R05_OBJ01_J {

    public static void main(String[] args) {
	
      Widget w = new Widget();
      w.add();
      w.add();
      w.remove();
      System.out.println(w.getTotal());
      
    }

    /*
     * Rule 05. Object Orientation (OBJ)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
     *
     *Rule 05_OBJ01
     */

    public static class Widget {
      private int total; // Declared private
 
      public int getTotal () {
        return total;
      }
          
      void add() {
        if (total < Integer.MAX_VALUE) {     
          total++;
          // ...
        } else {
          throw new ArithmeticException("Overflow");
        }
      }
     
      void remove() { 
        if (total > 0) {     
          total--;
          // ...
        } else {
          throw new ArithmeticException("Overflow");
        }
      }
    }
}
