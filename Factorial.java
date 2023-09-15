public class Factorial {
    
    // 1  s en =0 >>>>>
    // n * (n-1)! se n > 0 >>>>>caso recursivo
    public long iterative(int n) {

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial *i;
        }

        return factorial;

    }

    public long recursive(int n) {

        //caso base se não tiver ocorre loop infinito
        if (n == 0) {
            return 1;
        }
        //caso recursivo
        return n * recursive(n -1);
    }

}
