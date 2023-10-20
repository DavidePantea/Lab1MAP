public class ZahlenTests {
    public static void testMaxNumber() {
        int[] array = {10, 25, 5, 35, 15};
        int max = Zahlen.maxNumber(array);
        assert max == 35 : "Test failed for maxNumber (expected case)";

        int[] emptyArray = {};
        int unexpectedMax = Zahlen.maxNumber(emptyArray);
        assert unexpectedMax == Integer.MIN_VALUE : "Test failed for maxNumber (unexpected case)";
    }

    public static void testMinNumber() {
        int[] array = {10, 25, 5, 35, 15};
        int min = Zahlen.minNumber(array);
        assert min == 5 : "Test failed for minNumber (expected case)";

        int[] emptyArray = {};
        int unexpectedMin = Zahlen.minNumber(emptyArray);
        assert unexpectedMin == Integer.MAX_VALUE : "Test failed for minNumber (unexpected case)";
    }
}
