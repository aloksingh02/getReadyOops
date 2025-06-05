//1 method
//import java.util.Scanner;
//public class countOfNumberDigits {
//    public static int count(int num){
//        int count = 0;
//        if(num ==0) return 1;
//        while(num>0){
//            num/=10;
//            count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num1 = sc.nextInt();
//        int result = count(num1);
//        System.out.print("total number of digit is: "+result);
//    }
//}


//2 method
import java.util.Scanner;
public class countOfNumberDigits {
    public static int count(String num){
        return num.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num1 = sc.next();
        int result = count(num1);
        System.out.print("total number of digit is: "+result);
    }
}