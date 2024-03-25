package com.kyh.advanced.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("线程一");
        myThread2.setName("线程二");
        myThread1.start();//开启线程
        myThread2.start();

        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        t1.start();

        // 获取多线程运行的结果
        /**
         * 创建Callable实现Callable接口
         * 重写call 返回多线程运行结果
         * 创建MyCallabe的对象表示多线程要执行的任务
         * 创建FutureTask的对象管理多线程运行的结果
         */
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(myCallable);
        Thread t = new Thread(ft);
        t.start();
        Integer result = ft.get();
        System.out.println(result);

    }
}
