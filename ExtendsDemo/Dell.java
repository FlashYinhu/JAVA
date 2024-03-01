package ExtendsDemo;

public class Dell extends Computer{
    private String brand;

    // 继承中的构造方法
    public Dell() {
        super();
    }

    public Dell(String cpu, String gpu, double price, String brand) {
        super(cpu, gpu, price);
        this.brand = brand;
    }

    

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("Dell电脑的信息是" + this.brand + getCpu() + getGpu() + getPrice());
         
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



}

// 继承中构造方法的访问特点
/*
 * 子类不能继承父类的构造方法但是可以通过super调用
 * 子类构造方法的第一行有一个默认的super()
 * 默认先访问父类中的无参构造方法再执行自己
 * 如果想要方法父类有参构造必须手动书写
 * 
 */