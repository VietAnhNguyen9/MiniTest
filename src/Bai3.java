import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        for(int i = 0;i< arr.length;i++) {
            System.out.println("Nhập phần tử ở vị trí thứ "+ i);
            arr[i] = scanner.nextInt();
        }
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
