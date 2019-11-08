import java.io.Serializable;

/******************************************************************************
 * Compilation: javac R06_Met01_J.java Execution: java R06_Met01_J
 *
 * 
 *
 ******************************************************************************/

public class R14_SER00_J {

    public static void main(String[] args) {
      


    }

    /*
     * Rule 14. Serialization (SER)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
     *
     *Rule 14_SER00
     */

    static class GameWeapon implements Serializable {
      private static final long serialVersionUID = 24L;

      int numOfWeapons = 10;
             
      public String toString() {
        return String.valueOf(numOfWeapons);
      }
    }
}
