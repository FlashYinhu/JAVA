package ExtendsDemo;

public class Computer {
    // 静态变量不属于对象 属于类
    // 随类的加载而加载 优先于对象存在
    static int voltage; // 所有的电脑都共享一个输入电压
    private String cpu;
    private String gpu;
    private double price;
    
    public Computer() {
    }

    public Computer(String cpu, String gpu, double price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.price = price;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public void showInfo(){
        System.out.println("电脑的信息是" + this.cpu + this.gpu + this.price);
    }

    
}
