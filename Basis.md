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

