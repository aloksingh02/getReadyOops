import java.util.Scanner;
public class reverse_Number {
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = reverse(num);

        System.out.println("after reverse: "+result);
    }
}
