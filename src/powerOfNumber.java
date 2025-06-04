import java.util.Scanner;
public class powerOfNumber {
    public static int isPower(int a, int b){
        return (int)Math.pow(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = isPower(base, exponent);

        System.out.println("After power of number: "+result);
    }
}
