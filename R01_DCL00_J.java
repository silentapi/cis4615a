/******************************************************************************
 *  Compilation:  javac R01_DCL00_J.java
 *  Execution:    java R01_DCL00_J
 *
 *  
 *
 ******************************************************************************/

public class R01_DCL00_J {

    public static void main(String[] args) {
	
      System.out.println("The account balance is: " + Cycle.c.balance);
      
    }

    /*
     * Rule 01. Declarations and Initialization (DCL)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles
     *
     *Rule 01_DCL00
     */

    public static class Cycle {
      private final int balance;
      private static final int deposit = (int) (Math.random() * 100); // Random deposit
      private static final Cycle c = new Cycle();
     
      public Cycle() {
        balance = deposit - 10; // Subtract processing fee
      }
    }

}
