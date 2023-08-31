public class combination {
    public static int combinationOfNum(int n, int r){
        if (r > n - r) {
            r = n - r; // Choose the smaller value of r for optimization
        }
        
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n - r + i;
            result /= i;
        }
        
        return (int)result;
    }
}
