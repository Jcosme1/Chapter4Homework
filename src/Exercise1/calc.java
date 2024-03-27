package Exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do{
            try{
                System.out.println("Multiplication calculator: ");
                System.out.println("Enter a number: ");
                int num1 = input.nextInt();
                System.out.println("Enter another number");
                int num2 = input.nextInt();
                flag = false;
                System.out.print("TOTAL: ");
                System.out.println(num1 * num2);
                System.out.println("//NED OF PROGRAM///");
            } catch (Exception e){
                System.out.println("Invalid, type a integer \n");
                input.nextLine();
            }
        }while(flag);
    }
}
