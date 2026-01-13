import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void validateAge(int Age) throws InvalidAgeException {
        if (Age < 18) {

            throw new InvalidAgeException("Age is below 18");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int Age = sc.nextInt();

        try {
            validateAge(Age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
