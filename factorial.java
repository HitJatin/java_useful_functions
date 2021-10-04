public class factorial{
    public static int factorialNum(int num){
        if(num==0 || num==1)
        return 1;
        return num*factorialNum(num-1);
    }
}