public class Program {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.recursive(3));

        Power power = new Power();
        System.out.println(power.recursive(2, 3));

        int array[] = {2,4,10,19,27,38,47,49,50,55};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.recursive(array,0, array.length, 50));
        
    }
}