package com.kyh.advanced.Thread;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello!");
        }
    }
}
