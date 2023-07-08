package Bai4;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();
        Student student = new Student(name,age,tenLop);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getTenLop());
    }
}
