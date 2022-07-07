package edu.lab5;

import java.io.FileNotFoundException;

public class EDataFileNotFound extends FileNotFoundException {
    private static int code = 11111;

    public EDataFileNotFound(String message){
        super(String.format("Error code: %d. Message: %s", code, message));
    }
}
