public class OperationsTest {

    public static void main(String[] args) {
        testAdd();
        testSubtract();
        testMult();
        testDiv();
        testToArray();
        testToArrayNegative();
        testToArrayZero();
    }

    public static void testAdd() {
        int[] result = Operations.add(new int[]{1, 2}, new int[]{3, 4});
        int[] expected = new int[]{5, 6};
        assertArrayEquals(expected, result);
    }

    public static void testSubtract() {
        int[] result = Operations.subtract(new int[]{5, 6}, new int[]{3, 4});
        int[] expected = new int[]{2, 2};
        assertArrayEquals(expected, result);
    }

    public static void testMult() {
        int[] result = Operations.mult(new int[]{2, 3}, 4);
        int[] expected = new int[]{9, 2};
        assertArrayEquals(expected, result);
    }

    public static void testDiv() {
        int[] result = Operations.div(new int[]{8, 2}, 2);
        int[] expected = new int[]{4, 1};
        assertArrayEquals(expected, result);
    }



    public static void assertArrayEquals(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            System.err.println("Test failed: Arrays have different lengths.");
            return;
        }

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                System.err.println("Test failed: Mismatch at index " + i);
                return;
            }
        }

        System.out.println("Test passed.");
    }
}
