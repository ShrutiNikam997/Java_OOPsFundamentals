public class ExceptionBasics {
    public static void main(String[] args) {

        System.out.println("Normal try-catch");

        try {
            int a = 10;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Mltiple catch");

        try {

            int Arr[] = new int[3];
            Arr[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithematic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("Nested try-catch");

        try {
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            int Arr[] = new int[3];
            Arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
    }

}
