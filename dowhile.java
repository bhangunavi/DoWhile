import java.util.Scanner;

public class dowhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("The number is:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
                // 10 multiple enter loop end
            }
            System.out.println(n);

        } while (true);
        // keeps printing "The number is:" endlesly

    }
}