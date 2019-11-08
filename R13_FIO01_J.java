import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;
import java.nio.file.Path;

/******************************************************************************
 * Compilation: javac R13_FIO01_J.java Execution: java R13_FIO01_J
 *
 * Creates files with appropriate access permissions
 *
 ******************************************************************************/

public class R13_FIO01_J {

  public static void main(String[] args) throws IOException {
	
    Path file = new File("file").toPath();
 
    // Throw exception rather than overwrite existing file
    Set<OpenOption> options = new HashSet<OpenOption>();
    options.add(StandardOpenOption.CREATE_NEW);
    options.add(StandardOpenOption.APPEND);
     
    // File permissions should be such that only user may read/write file
    Set<PosixFilePermission> perms =
        PosixFilePermissions.fromString("rw-------");
    FileAttribute<Set<PosixFilePermission>> attr =
        PosixFilePermissions.asFileAttribute(perms);
     
    try (SeekableByteChannel sbc =
             Files.newByteChannel(file, options, attr)) {
      // Write data
    };      
    }

    /*
     * Rule 13. Input Output (FIO)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/FIO01-J.+Create+files+with+appropriate+access+permissions
     *
     *Rule 13_FIO01
     */

}
