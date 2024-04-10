package com.kyh.advanced.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解
public class Test03 {

    // 注解可以显式赋值 没有默认值一定要复制
    @MyAnnotation2(schools = {"NNU", "CPU"})
    public void test(){
    }

    @MyAnnotation3("value")
    public void test2(){}


    public static void main(String[] args) {

    }


}


@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数 ： 参数类型 + 参数名();
    // 定义了参数就要写参数 不然就要设置默认值
    String name() default "";
    int age() default 0;
    int id() default -1;// 默认-1 不存在 indexof 找不到返回-1

    String[] schools();
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    // 如果只有一个值 推荐用value关键字
    String value();
}
