import java.io.*;
import java.util.*;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Đọc file nhị phân "SONGUYEN.in"
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();  // Đọc ArrayList từ file

        int[] a = new int[10001];  // Mảng để đếm số lần xuất hiện của các số trong khoảng 0 - 10000

        // Duyệt qua danh sách và đếm số lần xuất hiện
        for (Integer x : ds) {
            a[x]++;
        }

        // Kiểm tra và in ra các số nguyên tố cùng với số lần xuất hiện
        for (int i = 2; i <= 10000; i++) {
            if (a[i] > 0 && ngto(i)) {
                System.out.println(i + " " + a[i]);
            }
        }
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean ngto(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
