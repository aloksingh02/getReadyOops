import java.util.Scanner;
public class sqrt {
    public static int sqrt(int num){
        return (int) Math.sqrt(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1  = sc.nextInt();

        int result = sqrt(num1);
        System.out.println("square root is: "+result);
    }
}
