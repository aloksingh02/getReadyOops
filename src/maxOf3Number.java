import java.util.Scanner;
public class maxOf3Number {
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the num3: ");
        int num3 = sc.nextInt();

        int result = max(num1, num2, num3);

        System.out.println("max number is: "+result);
    }
}
