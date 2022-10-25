import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String javaOnTheMoon = scanner.nextLine();
        System.out.println(javaOnTheMoon);

    }

    public void testMath() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num a: ");
        a = scanner.nextInt();
        System.out.print("Enter num b: ");
        b = scanner.nextInt();
        if(a != 0 && b != 0) {
            int sum = a + b;
            int sub = a - b;
            int multiply = a * b;
            int divide = a / b;
            System.out.println(sum + " " + sub + " " + multiply + " " + divide);
        }
        scanner.close();
    }

    public void testLogicalOperators(){
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        System.out.print(a && b);
        System.out.print(" ");
        System.out.print(a || c);
        scanner.close();
    }
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testLogicalOperators();
    }
}