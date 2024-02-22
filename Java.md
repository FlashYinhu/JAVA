# JAVA

JDK（java Development Kit）开发工具包的组成结构：JDK>JRE>JVM

JDK:

- Java 开发工具包

​		- 编译工具 javac.exe

​		- 打包工具 jar.exe

- JRE运行环境

​		- JVM虚拟机

​        	- java核心类库

​		- 运行工具

bin目录存放工具和命令 重要的有javac和java，config文件存放配置文件，include文件存放了一些特定平台的头文件，jmods存放了各种模块，legal存放了各个模块的授权文档，lib存放了工具的一些补充jar包

javac xxx.java -> java xxx

> Java SE \ Java ME \ Java EE 对应java语言的
>
> 标准版 小型版 企业版(Web方向网站)

桌面级应用开发 

> 税务软件，IDEA，Clion，Pycharm

企业级应用开发 

> 微服务，springcloud

移动应用开发

> 鸿蒙，android，医疗设备

科学计算

> matlab

大数据开发

> hadoop

游戏开发

> 我的世界

java 的主要特性

面向对象 安全 跨平台 开园 多线程 简单易用

write once, run anywhere 

高级语言的编译运行方式

- 编译型
- 解释型
- 混合型，半编译，半解释

c语言：hello.c -> hello.obj，python天生开源，java是混合型编译方式，先将.java文件编译为.class字节码文件，然后按行交给设备翻译运行，java也不是直接运行在设备上，而是运行在虚拟机上。

java跨平台的原理是通过虚拟机实现的，针对不同的操作系统安装不同的虚拟机就可以了。



JVM：Java Virtual Machine：java虚拟机，真正运行java程序的地方、核心类库、开发工具、运行工具、jdb调试工具、jhat内存分析工具。

别人要运行你的代码直接给.class文件，运行的运行环境：JRE（Java Runtime Environment）比较短小，不会占用太多空间。

```java
//这是单行注视
/*
	这是多行注释1
	这是多行注释2
	这是多行注释3
	...
*/

/**文档注释(暂时用不上)*/

public class HelloWorld{
    // main方法，表示程序的主入口
    public static void main(string[] args)
        //叫做输入语句（打印语句）
        System.out.printlen("Hello World!");
}

// 注释的时候请不要嵌套
```

定义数据类型中的注意事项

Long类型变量需要加L标识符（大小写都可以），float类型需要加入F标识符（大小写都可以）。

## 标识符

- 硬性要求

  数字、字母、下划线和$组成，不可以用数字开头，不能是关键字且区分大小写。

- 软性建议（简明知意）

​	小驼峰：方法和变量

​	一个单词小写，多个单词从第二个起大写。

` String name = "kangyinhu"; String firstName = "kang"; String lastName = "yinhu";`

​	大驼峰：类 

​	一个单词大写，多个单词全部大写。

project项目 module模块 package包 class类

## 运算符

byte, short, char 在进行运算的时候都会先提升为int类型。

## Java 内存分配

- 栈

> 方法在运行时使用的内存，比如main方法，进入main方法中执行

- 堆

> new出来的东西会在这一块内存中开辟空间并产生地址值

- 方法区
- 本地方法栈
- 寄存器

![image-20240221163117668](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221163117668.png)

基本数据类型

整数 浮点数 布尔 字符

其他数据类型都叫引用数据类型，引用几句是使用了其他空间中数据的意思

![image-20240221180227065](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221180227065.png)

## 类

~~~java
public class 类名{
    成员变量 属性 名词
    成员方法 行为 动词
    构造器
    代码块
    内部类
}

/*
	首字母大写 见名知意 驼峰
	一个java文件中可以定义多个class类 但是只有一个类是public修饰 且public修饰的类名必须为代码文件名
	实际开发中还是一个文件定义一个类
	成员变量的完整定义格式是
	修饰符 数据类型 变量名称 = 初始化值(一般存在默认)
*/
~~~

![image-20240221182308314](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221182308314.png)

## Javabean类

> 用来描述一类事物的类，专业叫做javabean类，在javabean类中不写main方法。编写main方法的类叫做测试类。

- 类名需要见名知意
- 成员变量用private修饰
- 提供至少两个构造方法
  - 无参
  - 带全部参数
- 成员方法
- 提供每一个成员变量的get set 方法
- 如果还有其他行为需要写上

## 封装 继承 多态

### 封装

人画圆 人关门

对象代表什么 就得封装对应的数据 并且提供数据对应的行为

private 修饰符是一个权限修饰符 可以修饰成员 成员变量和方法

被private变量修饰的成员只能在本类中进行访问

this 关键字 会使用成员变量

~~~java
/*
     * 构造方法 方法名和类名完全相同
     * 没有返回值类型 连void都没有
     * 没有具体的返回值 不能由return带回结果数据
     * 执行时机
     * 创建对象的时候由虚拟机调用 不可手动调用
     * 每创建一次对象都会调用一次构造方法
     * 如果我们自己没有写构造方法
     * 虚拟机会自动加上构造方法
     * 如果已经定义了构造方法 系统则不会提供空参构造
     */
public Bridge(String brand, double price, String maker){
    System.out.println("这是带参构造方法！");
    this.brand = brand;
    this.price = price;
    this.maker = maker;
}

// 注意 无论是否使用 都手动书写无参构造方法和全参构造方法
~~~

## 对象的内存图

![image-20240221202400883](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221202400883.png)

当没变量指向对象空间 该对象会变成垃圾 

![image-20240221202802492](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221202802492.png)

基本数据类型的数据值存储在自己的空间中，赋值给其他变量时也是赋的真实的值

引用数据类型存储在其他空间中，自己空间中存储的是地址值

this 的内存原理(区分局部变量和全局变量 )

this 的本质是所在方法调用者的地址值

![image-20240221204121330](/Users/yinhu/Library/Application Support/typora-user-images/image-20240221204121330.png)

## API

Application Programming Interface 应用程序编程接口

别人已经写好的东西 直接拿过来用

java.lang : java中最基础 最核心的包 不用写import
