package log4jtest;


import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Created by mixan on 01.06.2017.
 */
public class Log2Console {

    static Logger log = Logger.getLogger(Log2Console.class);

    public static void main(String[] args) {

        String pattern = "Millisec. from start: %r";
        pattern += "ClassName: %C %n, Info: %m %n";

        PatternLayout pl = new PatternLayout(pattern);
        ConsoleAppender ca = new ConsoleAppender(pl);

        log.addAppender(ca);
        log.setLevel(Level.ALL);
        log.debug("1. Debug-info");
        log.info("2. Info");
        log.warn("3. Warn-info");
        log.error("4. Error-info");
        log.fatal("5. Fatal-info");
    }
}
