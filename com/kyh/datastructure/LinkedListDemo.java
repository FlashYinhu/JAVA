package com.kyh.datastructure;

public class LinkedListDemo {
    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1, "a", "b");
        HeroNode h2 = new HeroNode(2, "b", "b");
        HeroNode h3 = new HeroNode(3, "c", "c");
        HeroNode h4 = new HeroNode(4, "d", "d");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(h1);
        singleLinkedList.add(h2);
        singleLinkedList.add(h3);
        singleLinkedList.add(h4);
        singleLinkedList.printList();
    }
}

class SingleLinkedList{
    // 头节点 作为head
    private HeroNode head = new HeroNode(0,"", "");

    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while(true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    public void printList() {
        if(head.next == null){
            System.out.println("链表为空");
        }
        HeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}




class HeroNode{
    int no;
    String name;
    String nickName;
    HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + this.nickName + '\'' +
                '}';
    }
}
