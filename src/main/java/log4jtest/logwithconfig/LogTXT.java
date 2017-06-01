package log4jtest.logwithconfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by mixan on 01.06.2017.
 */
public class LogTXT {

    static Logger log = Logger.getLogger(LogTXT.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4jconfig.txt");
        //log.setLevel(Level.DEBUG);
        log.debug("1. Debug message");
        log.info("2. Info message");
        log.warn("3. Warn. message");
        log.error("4. Error message");
        log.fatal("5. Fatal message");
    }

}
