import java.util.Arrays;
public class OperationsTest {

    public static void main() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Test addition
        int[] sum = Operations.add(a, b);
        int[] expectedSum = {5, 7, 9};
        checkResult("Addition Test", sum, expectedSum);

        // Test subtraction
        int[] difference = Operations.subtract(a, b);
        int[] expectedDifference = {-3, -3, -3};
        checkResult("Subtraction Test", difference, expectedDifference);

        // Test multiplication
        int[] product = Operations.mult(a, 2);
        int[] expectedProduct = {2, 4, 6};
        checkResult("Multiplication Test", product, expectedProduct);

        // Test division
        int[] division = Operations.div(a, 2);
        int[] expectedDivision = {0, 1, 1};
        checkResult("Division Test", division, expectedDivision);

        // Test unexpected cases
        int[] emptyArray = {};
        int[] zeroArray = {0, 0, 0};
        int[] largeNumber1 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] largeNumber2 = {1};

        // Test empty array addition
        int[] emptyArraySum = Operations.add(emptyArray, a);
        int[] expectedEmptyArraySum = a;
        checkResult("Empty Array Addition", emptyArraySum, expectedEmptyArraySum);

        // Test zero array subtraction
        int[] zeroArrayDifference = Operations.subtract(zeroArray, b);
        int[] expectedZeroArrayDifference = {-4, -5, -6};
        checkResult("Zero Array Subtraction", zeroArrayDifference, expectedZeroArrayDifference);

        // Test large number addition
        int[] expectedLargeSum = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        checkResult("Large Number Addition", Operations.add(largeNumber1, largeNumber2), expectedLargeSum);

        // Test division by zero
        int[] divisionByZero = Operations.div(a, 0);
        int[] expectedDivisionByZero = a; // Division by zero should not modify the array
        checkResult("Division by Zero", divisionByZero, expectedDivisionByZero);
    }

    // Helper method to check the result
    private static void checkResult(String testName, int[] result, int[] expected) {
        System.out.println(testName);
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println();
    }
}
