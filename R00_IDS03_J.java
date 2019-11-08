/* ************ ********************** Compilatio javac R03_IDS03_J.java
 *  Execution:    java R03_IDS03_J
 * 
 *  Logs usernames for login attempts for both valid and illegal usernames
 *
 ******************************************************************************/

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    public static void main(String[] args) {
  
      boolean loginSuccessful = true;
      Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
      String username = "guest";

      if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username));
      } else {
        logger.severe("User login failed for: " + sanitizeUser(username));
      }
      
      username = "guest\n" +
                 "Nov 08, 2019 4:09:25 AM R00_IDS03_J main\n" +
                 "SEVERE: User login succeeded for: administrator;";

      if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username));
      } else {
        logger.severe("User login failed for: " + sanitizeUser(username));
      }
    
    }

    /*
     * Rule 03. Input Validation and Data Sanitization (IDS)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input     *
     *Rule 00-IDS03
     */

    public static String sanitizeUser(String username) {
      return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
