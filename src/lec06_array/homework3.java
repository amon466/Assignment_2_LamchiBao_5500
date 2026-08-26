package lec06_array;

import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // cách 1: chỉ in ngược từ cuối lên đầu (Mảng gốc giữ nguyên)
        System.out.print("mảng 1 (In ngược): ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // cách 2: tạo mảng mới và chép ngược lại
        System.out.print("mảng 2 (Dùng mảng mới): ");//reversedarr là mảng đã đảo ngược 
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        // In mảng mới
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();
        // cách 3: hoán đổi trực tiếp các phần tử trong mảng gốc
        System.out.print("mảng 3 (Hoán đổi trực tiếp): ");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        // in mảng gốc (lúc này đã bị đảo ngược thực sự)
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
