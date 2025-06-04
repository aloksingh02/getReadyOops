import java.util.Scanner;
public class leapYear {
    public static boolean isLeap(int year){
        return ((year%4==0 && year%100!=0) || (year%400==0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        boolean result = isLeap(year);
        System.out.println("Year is leap: "+result);

    }
}
