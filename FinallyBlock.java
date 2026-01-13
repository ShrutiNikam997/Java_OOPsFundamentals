public class FinallyBlock {
    public static void main(String[] args) {
        /*------------------------------------------------------------------------------------- */
        System.out.println("Exception occurs");

        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        /*-------------------------------------------------------------------------------------------- */
        System.out.println("Exception doesnt occur");
        try {
            int a = 10;
            int b = 2;

            int c = a / b;
            System.out.println(c);
        } finally {
            System.out.println("Finally block executed");
        }
        /*-------------------------------------------------------------------------------------- */
        System.out.println("Return inside try");

        System.out.println(Method());

    }

    static int Method() {
        try {
            return 10;
        } finally {
            System.out.println("Finally block executed");
        }
    }
}