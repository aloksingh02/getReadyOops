import java.util.Scanner;
public class factorial {
    public static long isFactorial(int num){
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("it is negative");
        }
        else{
            long result = isFactorial(num);
            System.out.println("factorial of number is: "+result);
        }
    }
}
