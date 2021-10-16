import java.util.Scanner;

public class Consume_enter_after_int {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        int temp=inp.nextInt();
        consumeEnterAfterInt();
        String temp2=inp.nextLine();

        System.out.println(temp);
        System.out.println(temp2);
        
        int temp3=inp.nextInt();
        consumeEnterAfterInt(inp);
        String temp4=inp.nextLine();

        System.out.println(temp3);
        System.out.println(temp4);

        inp.close();
    }
    private static void consumeEnterAfterInt(Scanner inp){
        inp.nextLine();
    }
    private static void consumeEnterAfterInt(){
        Scanner inp=new Scanner(System.in);
        inp.nextLine();
        inp.close();
    }
}