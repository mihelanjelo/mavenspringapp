package log4jtest;

import org.apache.log4j.Logger;

/**
 * Created by mixan on 01.06.2017.
 */
public class LogFromProperties {

    static final Logger log = Logger.getLogger(LogFromProperties.class);

    public static void main(String[] args) {
        log.info("method is started");

        try{
            int i = 1/0;
        } catch (Throwable cause){
            log.error("can't divide on zero", cause);
        }
    }

}
