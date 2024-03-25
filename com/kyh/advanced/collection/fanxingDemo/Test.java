package com.kyh.advanced.collection.fanxingDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<BosiCat> arrayList1 = new ArrayList<>();
        ArrayList<LihuaCat> arrayList2 = new ArrayList<>();
        ArrayList<TidiDog> arrayList3 = new ArrayList<>();
        ArrayList<HsqDog> arrayList4 = new ArrayList<>();

        keepCat(arrayList1);
        keepCat(arrayList2);
//        keepCat(arrayList3);
//        keepCat(arrayList4);
//
//        keepDog(arrayList1);
//        keepDog(arrayList2);
        keepDog(arrayList3);
        keepDog(arrayList4);

        keepAnimal(arrayList1);
        keepAnimal(arrayList2);
        keepAnimal(arrayList3);
        keepAnimal(arrayList4);

    }
    public static void keepCat(ArrayList<? extends Cat> list){}
    public static void keepDog(ArrayList<? extends Dog> list){}
    public static void keepAnimal(ArrayList<? extends Animal> list){}
}
