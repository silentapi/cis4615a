import java.math.BigInteger;

/******************************************************************************
 * Compilation: javac R04_STR03_J.java Execution: java R04_STR03_J
 *
 * Turns BigInteger into a byte array and reconstructs it
 *
 ******************************************************************************/

public class R04_STR03_J {

    public static void main(String[] args) {
	
      BigInteger a = new BigInteger("530500452766");
      String s = a.toString();  // Valid character data
      byte[] byteArray = s.getBytes();
      String ns = new String(byteArray); 
      BigInteger b = new BigInteger(ns);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      
    }

    /*
     * Rule 04. Characters and Strings (STR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string     *
     *Rule 04-STR03
     */

}
