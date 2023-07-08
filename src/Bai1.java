import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n ngẫu nhiên: ");
        int n = scanner.nextInt();
        if (n<2) {
            System.out.println("Không có số nguyên tố nào thỏa mãn");
        }else {
            int i = 0;
            int number = 2;
            while (i<n-1) {
                boolean check = true;
                int j = 2;
                while (j < Math.sqrt(number)) {
                    if (number % 2 == 0) {
                        check = false;
                        break;
                    }
                    j++;
                }
                if (check) {
                    System.out.println(number);
                }
                number++;
                i++;
            }
        }

    }

}
