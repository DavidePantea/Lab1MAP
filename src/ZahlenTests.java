public class ZahlenTests {
    public static void testMaxNumber() {
        int[] array = {10, 25, 5, 35, 15};
        int max = Zahlen.maxNumber(array);
        assert max == 35 : "Test failed for maxNumber (expected case)";

        int[] emptyArray = {};
        int unexpectedMax = Zahlen.maxNumber(emptyArray);
        assert unexpectedMax == 0 : "Test failed for maxNumber (unexpected case)";
    }

    public static void testMinNumber() {
        int[] array = {10, 25, 5, 35, 15};
        int min = Zahlen.minNumber(array);
        assert min == 5 : "Test failed for minNumber (expected case)";

        int[] emptyArray = {};
        int unexpectedMin = Zahlen.minNumber(emptyArray);
        assert unexpectedMin == 0 : "Test failed for minNumber (unexpected case)";
    }

    public static void testBigger() {
        int[] array = {10, 25, 5, 35, 15};
        int sumWithoutMin = Zahlen.bigger(array);
        assert sumWithoutMin == 75 : "Test failed for bigger (expected case)";

        int[] emptyArray = {};
        int unexpectedSumWithoutMin = Zahlen.bigger(emptyArray);
        assert unexpectedSumWithoutMin == 0 : "Test failed for bigger (unexpected case)";
    }

    public static void testSmaller() {
        int[] array = {10, 25, 5, 35, 15};
        int sumWithoutMax = Zahlen.smaller(array);
        assert sumWithoutMax == 50 : "Test failed for smaller (expected case)";

        int[] emptyArray = {};
        int unexpectedSumWithoutMax = Zahlen.smaller(emptyArray);
        assert unexpectedSumWithoutMax == 0 : "Test failed for smaller (unexpected case)";
    }

    public static void main() {
        testMaxNumber();
        testMinNumber();
        testBigger();
        testSmaller();
    }
}
