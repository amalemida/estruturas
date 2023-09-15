public class Program {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.recursive(3));

        Power power = new Power();
        System.out.println(power.recursive(2, 3));
    }
}