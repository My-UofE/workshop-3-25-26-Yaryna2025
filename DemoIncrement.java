public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;
        int p = 3;
        // ++p and p++ give the same result because the increment is not in an expression.
        ++p;
        int q = p + 5; 

        System.out.println("a: " + a + ", b: " + b + ", x: " + x + ", y: " + y + ", p: " + p + ", q: " + q);
        System.out.println("i++ means post-increment");
        System.out.println("++i means pre-increment");

    }
}




