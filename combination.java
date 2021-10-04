public class combination {
    public static int combinationOfNum(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
    public static int factorial(int num){
        if(num==0 || num==1)
        return 1;
        return num*factorial(num-1);
    }
}
