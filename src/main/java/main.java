public class main {
    public class FactorialCalculator {
        public int calculateFactorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }
}
