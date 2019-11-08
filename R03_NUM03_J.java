import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/******************************************************************************
 * Compilation: javac R03_NUM03_J.java Execution: java R03_NUM03_J
 *
 * Calls function getInteger() with both normal values and large unsigned value
 *
 ******************************************************************************/

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
  
      byte[] bytes = ByteBuffer.allocate(4).putInt(1337).array();
      DataInputStream is = new DataInputStream(new ByteArrayInputStream(bytes));
      System.out.println("a = " + getInteger(is));

      bytes = ByteBuffer.allocate(4).putInt(-512).array();
      is = new DataInputStream(new ByteArrayInputStream(bytes));
      System.out.println("a = " + getInteger(is));
      
    }

    /*
     * Rule 03. Numeric Types and Operations (NUM)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data     *
     *Rule 03-NUM03
     */

    public static int getInteger(DataInputStream is) throws IOException {
      return is.readInt(); 
    }
}
