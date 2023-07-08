public class Bai2 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        int max = arr[0];
        for (int i = 0;i<arr.length;i++) {
            total += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Tổng các phần tử trong mảng là: "+total);
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
    }
}
