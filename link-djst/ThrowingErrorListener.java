import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import org.antlr.v4.runtime.*;
import java.nio.charset.Charset;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener {

   public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

   private static String newline = System.getProperty("line.separator");
   private String errorMsg = "Syntax error list:";
   Path file = Paths.get("ErrorLog_Syntax.log");

   @Override
   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

   		// Here I'm gonna create a file to keep all errors.
   		errorMsg = errorMsg + newline + " line " + line + ":" + charPositionInLine + " " + msg;

   		writeErrors(errorMsg, file);
    }

    private void writeErrors(String msgs, Path file) {
    	try {
    		//Files.deleteIfExists(file);
    		Files.write(file, Arrays.asList(msgs), Charset.forName("UTF-8"));
	} catch (IOException e) {
			System.err.println("Something is wrong.");
		}
    }
}
