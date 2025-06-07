import java.util.Scanner;
public class sumOfAllPrimeNumber {
    public static boolean isPrime(int num){
        if (num<=1) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public static int sumOfPrime(int n){
        int sum =0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = sumOfPrime(num);
        System.out.println("sum of prime number: "+result);
    }
}
