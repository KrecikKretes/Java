package edu.lab5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static CDataFile badReference = null;
    private static Logger logger = Logger.getLogger("aLogger");
    private static FileHandler fh;

    private static void assignLogger(){
        try{
            fh = new FileHandler("C:\\temp\\mojloger.log", true);

            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
            fh.setFormatter(new SimpleFormatter());
        }catch(SecurityException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void releaseLogger(){
        logger.removeHandler(fh);
    }

    public static void main(String[] args) {
        assignLogger();
        try{
           // badReference.readFile();
            CDataFile badDataFile = new CDataFile ("C:\\Temp\\path-which-not-exist\\file.dat");
            //CDataFile dataFile = new CDataFile("C:\\Temp\\java-intellij\\Lab05\\src\\resource\\file-bad-header.dat";

        }catch(EDataFileNotFound | EDataFileIncorrectHeader | EDataFileIncorrectFooter | EParameterErrorRange ee){
            logger.info(ee.getMessage());
        }
        releaseLogger();
    }
}
