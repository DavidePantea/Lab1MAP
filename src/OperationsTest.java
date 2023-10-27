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

        // Test unexpected cases with long numbers
        int[] longNumber1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] longNumber2 = {1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedLongSum = {2, 0, 8, 7, 7, 6, 5, 4, 3, 2, 1};
        checkResult("Long Number Addition", Operations.add(longNumber1, longNumber2), expectedLongSum);

        int[] longNumber3 = {5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] longNumber4 = {2};
        int[] expectedLongDivision = {2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        checkResult("Long Number Division", Operations.div(longNumber3, 2), expectedLongDivision);
    }

    // Helper method to check the result
    private static void checkResult(String testName, int[] result, int[] expected) {
        System.out.println(testName);
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println();
    }
}
