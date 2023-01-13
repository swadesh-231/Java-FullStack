import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String scanned =in.next();
        int x=Integer.parseInt(scanned);
        System.out.println(x);
        in.close();

    }
}
