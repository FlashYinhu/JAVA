package com.kyh.datastructure;

public class QueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        System.out.println("查看队列中的数据");
        arrayQueue.show();
        System.out.println("查看头" + arrayQueue.head());
        System.out.println("查看尾" + arrayQueue.tail());
        System.out.println("取出队列中的数据" + arrayQueue.get());
        System.out.println("查看队列中的数据");
        arrayQueue.show();
    }
}

/**
 * 队列对象
 */
class  ArrayQueue{
    private int maxSize; // 最大容量
    private  int front; // 队列头
    private  int rear; // 队列尾
    private int[] arr; // 队列数据

    // 构造方法
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
        front = -1;
        rear = -1;
    }

    // 往队列中存数据
    public void add(int n){
        if(isFull()){
            throw new RuntimeException("队列已满");
        }
        rear = rear + 1;
        arr[rear] = n;
    }

    // 从队列中取出数据
    public int get() {
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        front = front + 1;
        return arr[front];
    }

    // 判断队列是否为空
    private boolean isEmpty(){
        return rear == front;
    }

    // 判断队列是否已满
    private boolean isFull(){
        return rear == maxSize - 1;
    }

    // 查看队尾数据
    public int tail() {
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        return arr[rear];
    }

    // 查看队头数据
    public int head(){
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        return arr[front];
    }

    // 查看队列中的数据
    public void show() {
        if(isEmpty()) {
            throw new RuntimeException("队列空");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d \n", i, arr[i]);
        }
    }


}
