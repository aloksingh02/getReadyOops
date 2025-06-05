import java.util.Scanner;
public class Simple_interest {
    public static int SI(int p, int r, int t){
        return (int) ((p*r*t)/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();

        int result = SI(p,r,t);
        System.out.println("Simple interest is: "+result);
    }
}
