package com.kyh.standard.ExtendsDemo;

public class Ipad extends Computer {
    private String cop;

    public Ipad() {
        super();
    }

    public Ipad(String cpu, String gpu, double price, String cop) {
        super(cpu, gpu, price);
        this.cop = cop;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    @Override
    public void showInfo() {
        System.out.println("苹果电脑的信息是" + this.cop + getCpu() + getGpu() + getPrice());
    }
    
}
