
public class A1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sayHello());
        System.out.println();
        System.out.print("The sum of two numbers with decimals is ");
        System.out.println(sum(11.0, 3.1));
        System.out.println();
        System.out.print("The quotient of 2 integers is ");
        System.out.println(divide(9, 3));
    }

    public static String sayHello() {
        return "Hello World!";
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
