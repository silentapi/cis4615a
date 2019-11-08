/******************************************************************************
 *  Compilation:  javac R08_VNA00_J.java
 *  Execution:    java R08_VNA00_J
 *
 *
 * 
 ******************************************************************************/

public class R08_VNA00_J {

    public static void main(String[] args) {
  

    }

    /*
     * Rule 08. Visibility and Atomicity (VNA)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/VNA00-J.+Ensure+visibility+when+accessing+shared+primitive+variables
     *
     *Rule 08_VNA00
     */

    final static class ControlledStop implements Runnable {
      private volatile boolean done = false;
      
      @Override public void run() {
        while (!done) {
          try {
            // ...
            Thread.currentThread().sleep(1000); // Do something
          } catch(InterruptedException ie) {
            Thread.currentThread().interrupt(); // Reset interrupted status
          }
        }   
      }
     
      public void shutdown() {
        done = true;
      }
    }
}
