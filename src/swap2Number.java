import java.util.Scanner;
public class swap2Number {
    public static int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a :"+a+" and b: "+b);
        return temp;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int result = swap(a, b);

    }
}
