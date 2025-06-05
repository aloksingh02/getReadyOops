import java.util.Scanner;
public class armstrongNumber {
    public static int count(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num){
        int n = count(num);
        int sum = 0;
        int temp = num;

        while(temp>0){
            int digit = temp%10;
            sum+= Math.pow(digit, n);
            temp/=10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();


        if(isArmstrong(num)){
            System.out.println(num + " is a armstrong number");
        }
        else{
            System.out.println(num+ " is not a armstrong number");
        }
    }
}
