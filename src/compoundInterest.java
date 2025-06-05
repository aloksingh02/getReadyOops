import java.util.Scanner;
public class compoundInterest {
    public static double CI(double p, double r, double t){
        double amount = p*Math.pow((1+r/100),t);
        double CI = amount - p;
        return CI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time: ");
        double t = sc.nextDouble();

        double result = CI(p,r,t);
        System.out.println("Compound Interest is: "+result);
    }
}
