import java.util.Scanner;
public class maxOfTwoNumber {
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();

        //calling the method
        int result = max(num1, num2);

        System.out.println("Maximum is: "+result);
    }
}


