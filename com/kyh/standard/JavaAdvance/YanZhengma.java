package com.kyh.standard.JavaAdvance;

import java.util.Random;

public class YanZhengma {
    public static void main(String[] args) {
        String yzm = "";
        char[] myChar = new char[52];
        Random rd = new Random();
        for(int i = 0; i < 51; i++){
            // ASCII 65 97
            if(i < 26){
                myChar[i] = (char)(97 + i);
            }else{
                myChar[i] = (char)(65 + i - 26);
            }
        }
        //printArray(myChar);
        
        for(int i = 0; i < 4; i++){
            int randomIndex = rd.nextInt(52);
            yzm = yzm + myChar[randomIndex];
        }

        System.out.println(yzm + rd.nextInt(10));
    }

    public static void printArray(char[] c){
        for(int i = 0; i < c.length; i ++){
            System.out.print(c[i]);
        } 
    }
}
