package ObjectRangeII;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student(1, "kangyinhu", 24);
        Student s2 = new Student(2, "zhangrui", 23);
        Student s3 = new Student(3, "xiaolei", 23);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("请输入要添加的学生信息，按空格隔开");
        Scanner sc = new Scanner(System.in);
        int newID = sc.nextInt();
        String newName = sc.next();
        int newAge = sc.nextInt();
        Student s4 = new Student(newID, newName, newAge);

        if (existsAlready(students, newID)){
            System.out.println("id 已经存在 请重新输入！");
        }else{
            // 判断数组是否已满
            if (fullAlready(students)){
                System.out.println("数组已满，为您扩容");
                Student[] students2 = expendStudents(students);
                System.out.println("新的数组长度为" + students2.length);
                addValue(students2, s4);
                students = students2;
                // printInfo(students2);
            }else{
                // for (int i = 0; i < students.length; i ++){
                //     if(students[i].getName() != null){
                //         students[i] = s4;
                //     }
                // }
                addValue(students, s4);
                // printInfo(students);
            }
        }

        printInfo(students);

        System.out.println("请输入您要删除的id");
        int deleteNum = sc.nextInt();
        deleteValue(students, deleteNum);
        printInfo(students);

        System.out.println("请输入您要修改年龄的id");
        int modifyNum = sc.nextInt();
        modifyNum(students, modifyNum);
        printInfo(students);

        sc.close();
    }

    public static void printInfo(Student[] students){
        for (int i = 0; i < students.length; i ++){
            if (students[i] != null){
                System.out.println("学生的id为:"+ students[i].getId() + " 姓名为"+ students[i].getName() + " 年龄为" + students[i].getAge());
            }
        }
    }

    public static void addValue(Student[] students, Student student){
        for (int i = 0; i < students.length; i ++){
           if(students[i] == null){
            students[i] = student;
           }
        }
    }

    public static Student[] expendStudents(Student[] students){
        Student[] newStudents = new Student[students.length + 1];
        for(int i = 0; i < students.length; i ++){
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    public static boolean fullAlready(Student[] students){
        for(int i = 0; i < students.length; i ++){
            if(students[i].getName() == null){
                return false;
            }
        }
        return true;
    }

    public static boolean existsAlready(Student[] students, int id){
        for(int i = 0; i < students.length; i ++){
            if(students[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public static void deleteValue(Student[] students, int id){
        boolean flag = true;
        for(int i = 0; i < students.length; i ++){
            Student student = students[i];
            if(student != null){
                if (student.getId() == id){
                    students[i] = null;
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("您要删除的id不存在");
        }
    }

    public static void modifyNum(Student[] students, int id){
        boolean flag = true;
        for (int i = 0; i < students.length; i ++){
            Student s = students[i];
            if (s != null){
                if (s.getId() == id){
                    s.setAge(s.getAge() + 1);
                    students[i] = s;
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("您输入的id不存在");
        }
    }
}
