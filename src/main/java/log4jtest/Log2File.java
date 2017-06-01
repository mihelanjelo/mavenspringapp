package log4jtest;

import org.apache.log4j.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mixan on 01.06.2017.
 */
public class Log2File {
    static Logger log = Logger.getLogger(Log2File.class);

    public static void main(String[] args) throws IOException {

        String pattern = "Millisec. from start: %r";
        pattern += "ClassName: %C %n, Info: %m %n";

        //PatternLayout pl = new PatternLayout(pattern);
        SimpleLayout sl = new SimpleLayout();
        FileAppender fa = new FileAppender(sl, "log.txt", false);
        log.addAppender(fa);
        log.setLevel(Level.DEBUG);
        log.debug("1. Debug-info");
        log.info("2. Info");
        log.warn("3. Warn-info");
        log.error("4. Error-info");
        log.fatal("5. Fatal-info");
    }
}
