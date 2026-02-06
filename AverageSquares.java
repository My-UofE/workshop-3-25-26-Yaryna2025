import java.util.Scanner;

public class AverageSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = in.nextLine();
        // System.out.println("Hi " + name + "!");

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); 

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        double sum = 0; 
        int i = startNum;
        int count = 0;

        while (i <= endNum) {
            sum += i * i;
            i++;
            count++;
        }

        double average = sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}
