package Exercise2;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] myArray = new double[50];
        Random random = new Random();
//        boolean isInvalid = true;
        for (int i =0; i <myArray.length; i++){
            //
            myArray[i] = random.nextInt();
        }
        // this just to check that it works dont need to print out
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        do {
            //
            try {
                System.out.println("Enter a number: ");
//                int num1 = scanner.nextInt();
                    String str1 = scanner.nextLine();
                    int num = Integer.parseInt(str1); //just gives the int value from a string
                System.out.println(myArray[num]);
//                isInvalid = true;
                System.out.println("///END OF PROGRAM///");
                //return basically ends the program while break would just break you out of the loop you're in so
                //if tihs do while loop was in another loop it would go into that one
                return; // ends the method different break would just break out of the loop!
            } catch (Exception e) {
                System.out.println("Invalid, enter a number");
                scanner.nextLine();
//                isInvalid= true;
            }
        }while(true);// another way to do try and catches seems like using flags isn't always needed but its prob good when there is
        // a lot happening



    }
}
