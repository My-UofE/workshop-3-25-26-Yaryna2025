import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Commented out name input/output
        // System.out.print("Enter your name: ");
        // String name = in.nextLine();
        // System.out.println("Hi " + name + "!");

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); 

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i * i;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}
