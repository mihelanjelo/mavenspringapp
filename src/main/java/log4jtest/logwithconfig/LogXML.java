package log4jtest.logwithconfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by mixan on 01.06.2017.
 */
public class LogXML {
    static Logger log = Logger.getLogger(LogXML.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("log4jconfig.xml");
        //log.setLevel(Level.DEBUG);
        log.debug("1. Debug message");
        log.info("2. Info message");
        log.warn("3. Warn. message");
        log.error("4. Error message");
        log.fatal("5. Fatal message");
    }
}
