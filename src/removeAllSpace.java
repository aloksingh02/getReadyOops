import java.util.Scanner;
public class removeAllSpace {
    public static String removeAllSpace(String str){
        return str.replaceAll(" ", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String result = removeAllSpace(str);
        System.out.println("Enter the line: "+result);
    }
}
