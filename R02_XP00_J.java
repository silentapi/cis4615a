import java.io.File;

/******************************************************************************
 * Compilation: javac R02_XP00_J.java Execution: java R02_XP00_J
 *
 * Calls someFile.delete()
 *
 ******************************************************************************/

public class R02_XP00_J {

    public static void main(String[] args) {
	
      File someFile = new File("someFileName.txt");
      // Do something with someFile
      if (!someFile.delete()) {
        // Handle failure to delete the file
      }
     
    }

    /*
     * Rule 02. Expressions (EXP)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
     *Rule 02-EXP00-J
     */
}
