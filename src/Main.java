import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("END")) break;  // Dừng khi gặp xâu "END"
            System.out.println(chuanHoa(line));
        }
        sc.close();
    }

    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        boolean kyTuDau = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(kyTuDau ? kyTuHoa(c) : kyTuThuong(c));
                kyTuDau = false;
            } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(' ');
                kyTuDau = true;
            }
        }
        return sb.toString().trim();
    }

    public static char kyTuHoa(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
    }

    public static char kyTuThuong(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    }
}
