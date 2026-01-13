import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Balance");
        int Balance = sc.nextInt();

        System.out.println("Enter withdrw ammount");
        int WithDraw = sc.nextInt();

        try {
            if (WithDraw > Balance) {
                throw new ArithmeticException("Insufficient Balance");

            }

            Balance = Balance - WithDraw;
            System.out.println("Withdraw successfull");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}