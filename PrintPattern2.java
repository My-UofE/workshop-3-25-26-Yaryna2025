import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size;

        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            } else {
                break; 
            }
        }

        for (int row = 1; row <= size; row++) {
            for (int col = row; col < row + size; col++) {
                System.out.print(col);
            }
            
            for (int col = row + size - 1; col >= row; col--) {
                System.out.print(col);
            }
            System.out.println();
        }

        for (int row = size; row >= 1; row--) {
            for (int col = row; col < row + size; col++) {
                System.out.print(col);
            }
            for (int col = row + size - 1; col >= row; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}