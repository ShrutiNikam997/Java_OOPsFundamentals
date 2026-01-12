
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Addition aobj = new Addition();
        System.out.println(aobj.add(12, 10));
        System.out.println(aobj.add(12.5f, 15.8f));
        System.out.println(aobj.add(12.1234, 20.9876));
        ;

    }
}