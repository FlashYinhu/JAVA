package com.kyh.advanced.annotation;

import java.lang.annotation.*;

@MyAnnotation
// 测试元注解
public class Test02 {

    @MyAnnotation
    public void function1(){

    }

}

// 定义一个注解
@Target(value = {ElementType.METHOD, ElementType.TYPE}) // 作用于方法上 （方法和类）
@Retention(value = RetentionPolicy.RUNTIME) // 表示注解的有效范围（生命周期中） RUNTIME > CLASS > SOURCE
@Documented // 表示是否将注解生成在JAVAdoc中
@Inherited // 表示子类可以继承父类的注解
@interface MyAnnotation{

}
