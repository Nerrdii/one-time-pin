package edu.ucmo.mathcs.onetimepin;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    /*static private FileHandler fileHTML;
    static private Formatter formatterHTML;*/

    static Logger logger;

    public static void setup() throws IOException {

        // get the global logger to configure it
        logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.setLevel(Level.INFO);
        fileTxt = new FileHandler("Logging.txt", true);
        //fileHTML = new FileHandler("Logging.html", true);

        // create a TXT formatter
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

        // create an HTML formatter
        /*formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);*/
    }
}
