import java.io.*;
import java.util.*;

public class J07031 {

   
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
     
        ArrayList<Integer> ds1;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))) {
            ds1 = (ArrayList<Integer>) in.readObject();
        }

       
        ArrayList<Integer> ds2;
        try (ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"))) {
            ds2 = (ArrayList<Integer>) in2.readObject();
        }

     
        Set<Integer> data1 = new HashSet<>(ds1);
        Set<Integer> data2 = new HashSet<>(ds2);

      
        List<Integer> primesInData1 = new ArrayList<>();
        data1.stream().filter((n) -> (isPrime(n) && !data2.contains(n))).forEachOrdered((n) -> {
            primesInData1.add(n);
        });

      
        Collections.sort(primesInData1);

      
        List<int[]> result = new ArrayList<>();
        Set<Integer> primeSet = new HashSet<>(primesInData1); 

        primesInData1.forEach((n) -> {
            int m = 1000000 - n;
            if (m > n && primeSet.contains(m)) {
                result.add(new int[] {n, m});
            }
        });

      
        result.forEach((pair) -> {
            System.out.println(pair[0] + " " + pair[1]);
        });
    }
}
