import java.util.Arrays;
import java.util.Scanner;

public class timGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;  //kích thước mảng
        int arr[];  //Tạo mảng tên arr
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Mảng không được quá 20 phần tử!");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i< arr.length){
            System.out.println("Nhập phần tử thứ "+ (i+1)+" : ");
            arr[i]= scanner.nextInt();
            i++;
        }
        System.out.println("Mảng sau khi đã khởi tạo là: ");
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]> max){
                max = arr[j];
                index = j;
            }
        }
        System.out.println("Tìm thấy giá trị lơn nhất là "+ max + " tại vị trí " + index );
    }
}