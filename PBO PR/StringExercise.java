
import java.util.Scanner;


public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next(); // input string pertama
        String B = sc.next(); // input string kedua

        // 1. Jumlahkan panjang string
        System.out.println(A.length() + B.length());

        // 2. Bandingkan secara lexicographical
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapital huruf pertama
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();
    }
}
