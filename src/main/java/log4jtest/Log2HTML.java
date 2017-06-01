package log4jtest;

import org.apache.log4j.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mixan on 01.06.2017.
 */
public class Log2HTML {

    static Logger log = Logger.getLogger(Log2HTML.class);

    public static void main(String[] args) throws IOException {

        String pattern = "Millisec. from start: %r";
        pattern += "ClassName: %C %n, Info: %m %n";
        HTMLLayout hl = new HTMLLayout();
        FileOutputStream fos = new FileOutputStream("logs.html");
        WriterAppender wa = new WriterAppender(hl, fos);
        log.addAppender(wa);
        log.setLevel(Level.DEBUG);
        log.debug("1. Debug-info");
        log.info("2. Info");
        log.warn("3. Warn-info");
        log.error("4. Error-info");
        log.fatal("5. Fatal-info");
    }
}
