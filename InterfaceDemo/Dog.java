package InterfaceDemo;

public class Dog extends Animal implements Swim {

    public Dog(){
        super();
    }
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    // 实现接口类
    public void swin() {
        System.out.println("狗会游泳");
    }

    @Override
    // 实现抽象动物类的抽象方法
    public void eat() {
        System.out.println("狗吃骨头");
    }

    
}
