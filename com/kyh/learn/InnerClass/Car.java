package com.kyh.learn.InnerClass;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;


    public void show(){
        System.out.println(carName);
        // System.out.println(engineName); false
    }

    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(carName);
            System.out.println(engineName);
        }
    }
}
