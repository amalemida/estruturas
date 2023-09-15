public class Power {
    
    public int iterative(int x, int n) {

        int power = 1;

        for (int i = 0; i < n; i++ ) {
            power = power * x;
        }

        return power;
    }

    public int recursive(int x, int n) {
        //caso base
        if (n==0) {
            return 1;
        }

        return x * recursive(x, n -1);
    } 
}
