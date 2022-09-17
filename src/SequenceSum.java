import java.util.Scanner;

public class SequenceSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int a = 0;
        int b = 0;
        do {
            a = scan.nextInt();
            i += a;
            b = i;
        } while (a != 0);
        System.out.println(b);
    }
}
