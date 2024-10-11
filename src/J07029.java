import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07029 {

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Bước 1: Đọc các số nguyên từ file nhị phân bằng ObjectInputStream
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();  // Đọc đối tượng ArrayList<Integer> từ file
        in.close();  // Đóng file sau khi đọc

        // Bước 2: Tạo mảng f[] để lưu các số nguyên tố
        boolean[] f = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) {
            f[i] = laSoNguyenTo(i);
        }

        // Bước 3: Tạo TreeMap để lưu số nguyên tố và số lần xuất hiện
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        a.forEach(e -> {
            if (e <= 1000000 && f[e]) {  // Nếu e là số nguyên tố và nhỏ hơn hoặc bằng 1,000,000
                hm.put(e, hm.getOrDefault(e, 0) + 1);  // Cập nhật số lần xuất hiện
            }
        });

        // Bước 4: In ra 10 số nguyên tố lớn nhất và số lần xuất hiện
        for (int i = 0; i < 10 && !hm.isEmpty(); i++) {
            int k = hm.lastKey();  // Lấy số nguyên tố lớn nhất
            System.out.println(k + " " + hm.get(k));  // In số nguyên tố và số lần xuất hiện
            hm.remove(k);  // Xóa số nguyên tố đã in
        }
    }
}
