import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_1{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (isEnd(line)) break;
            System.out.println(chuanHoa(line));
        }
        sc.close();
    }

    public static boolean isEnd(String line) {
        return line.length() == 3 && line.charAt(0) == 'E' && line.charAt(1) == 'N' && line.charAt(2) == 'D';
    }

    public static String chuanHoa(String s) {
        char[] result = new char[s.length()];
        int index = 0;
        boolean kyTuDau = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                result[index++] = kyTuDau ? kyTuHoa(c) : kyTuThuong(c);
                kyTuDau = false;
            } else if (index > 0 && result[index - 1] != ' ') {
                result[index++] = ' ';
                kyTuDau = true;
            }
        }
        return new String(result, 0, index);
    }

    public static char kyTuHoa(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
    }

    public static char kyTuThuong(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    }
}
