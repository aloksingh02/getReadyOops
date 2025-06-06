import java.util.Scanner;
public class trailingZero {
    public static long isFact(int num) {
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    public static long trailingZero(int num) {
        long n = isFact(num);
        long count = 0;
        while(n%10==0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        long result = trailingZero(num1);
        System.out.println("Trailing zero is: "+result);
    }
}
