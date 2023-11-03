import java.util.Arrays;

public class OperationsTest {

    public static void main() {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testEmptyArrayAddition();
        testZeroArraySubtraction();
        testLargeNumberAddition();

    }

    public static void testAddition() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] sum = Operations.add(a, b);
        int[] expectedSum = {5, 7, 9};
        checkResult("Addition Test", sum, expectedSum);
    }

    public static void testSubtraction() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] difference = Operations.subtract(a, b);
        int[] expectedDifference = {-3, -3, -3};
        checkResult("Subtraction Test", difference, expectedDifference);
    }

    public static void testMultiplication() {
        int[] a = {1, 2, 3};

        int[] product = Operations.mult(a, 2);
        int[] expectedProduct = {2, 4, 6};
        checkResult("Multiplication Test", product, expectedProduct);
    }

    public static void testDivision() {
        int[] a = {1, 2, 3};

        int[] division = Operations.div(a, 2);
        int[] expectedDivision = {0, 1, 1};
        checkResult("Division Test", division, expectedDivision);
    }

    public static void testEmptyArrayAddition() {
        int[] a = {1, 2, 3};
        int[] emptyArray = {};

        int[] emptyArraySum = Operations.add(emptyArray, a);
        int[] expectedEmptyArraySum = a;
        checkResult("Empty Array Addition", emptyArraySum, expectedEmptyArraySum);
    }

    public static void testZeroArraySubtraction() {
        int[] b = {4, 5, 6};
        int[] zeroArray = {0, 0, 0};

        int[] zeroArrayDifference = Operations.subtract(zeroArray, b);
        int[] expectedZeroArrayDifference = {-4, -5, -6};
        checkResult("Zero Array Subtraction", zeroArrayDifference, expectedZeroArrayDifference);
    }

    public static void testLargeNumberAddition() {
        int[] largeNumber1 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] largeNumber2 = {1};

        int[] expectedLargeSum = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        checkResult("Large Number Addition", Operations.add(largeNumber1, largeNumber2), expectedLargeSum);
    }

    //

    private static void checkResult(String testName, int[] result, int[] expected) {
        System.out.println(testName);
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println();
    }
}
