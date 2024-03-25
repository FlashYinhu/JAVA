package com.kyh.advanced;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Logger;

public class ExceptionDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process");
        logger.warning("memory is running out");
        logger.fine("ignored");
        logger.severe("process will be terminated");


        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
        String s = "C:/Users/Yinhu/Desktop/代码.txt";
        try{
            openLocalFiles(s);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException unsupportedEncodingException) {
            System.out.println(unsupportedEncodingException);
            return s.getBytes();
        }
    }

    public static void openLocalFiles(String s) throws IOException {
        File file = new File(s);
        try{
            if(file.exists() && file.isDirectory()) {
                Desktop.getDesktop().open(file);
                System.out.println("Finished");
            } else {
                System.out.println("Not a file or file do not exist");
            }
        } catch (IOException e){
            System.out.println("Failed" + e.getMessage());
        }

    }


}
