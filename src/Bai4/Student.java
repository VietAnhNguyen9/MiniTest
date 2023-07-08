package Bai4;
import java.util.Scanner;
public class Student {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    String tenLop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public Student(String name,int age,String tenLop) {
        this.name = name;
        this.age = age;
        this.tenLop = tenLop;
    }

}
