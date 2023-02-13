package com.sayan.JavaCommandRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger logger = LogManager.getLogger(App.class); 
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(logger.getLevel());
        logger.debug("debug log");
        logger.info("info log");
        logger.error("error log");
    }
}
