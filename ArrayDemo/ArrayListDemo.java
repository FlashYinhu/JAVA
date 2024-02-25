package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        // 泛型 限定集合中存储的数据类型
        // ArrayList<String> list = new ArrayList<String>(); JDK7 前
        // 打印的不是地址值而是集合中存储的数据类型
        // 打印时会用[]进行包裹

        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>(); // JDK7后
        System.out.println(arrayList);
        //int[] arr = new int[3];

        // ArrayList的成员方法 增删改查
        // 添加元素
        arrayList.add("aaa"); // 不管添加什么都会添加成功 返回true
        // System.out.println(arrayList.add(null)); // true
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        System.out.println(arrayList);

        // 删除元素
        boolean result = arrayList.remove("aaa");
        System.out.println(result);
        System.out.println(arrayList);
        System.out.println(arrayList.remove("eee")); // 删除失败
        
        String deleteStr = arrayList.remove(0);
        System.out.println("被删除的元素是" + deleteStr);
        System.out.println(arrayList);

        // 修改
        String modifiedStr = arrayList.set(0, "first"); //返回被覆盖的元素
        System.out.println(modifiedStr);
        System.out.println(arrayList);
        
        // 查询
        System.out.println(arrayList.get(0));

        // 遍历 注意不是length是size
        System.out.println(arrayList.size());
        for(int i = 0; i < arrayList.size(); i ++){
            System.out.println(arrayList.get(i));
        }
    }
}
