import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            if (s.equals("tim")) {
                System.out.println("You types tim");
            } else if (s.equals("hello")) {
                System.out.println("you typed hello");

            } else {
                System.out.println("Print");
            }
        }

    }
}
