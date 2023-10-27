public class ElektronikTests {
    public static void testCheaper() {
        int[] prices = {50, 30, 75, 40};
        int cheapest = Elektronik.cheaper(prices);
        assert cheapest == 75 : "Test failed for cheaper (expected case)";

        int[] emptyPrices = {};
        int unexpectedCheapest = Elektronik.cheaper(emptyPrices);
        assert unexpectedCheapest == -1 : "Test failed for cheaper (unexpected case)";
    }

    public static void testExpensive() {
        int[] tastature = {30, 20, 40};
        int[] usb = {25, 35, 15};
        int mostExpensive = Elektronik.expensive(tastature, usb);
        assert mostExpensive == 40 : "Test failed for expensive (expected case)";

        int[] emptyTastature = {};
        int[] emptyUsb = {};
        int unexpectedMostExpensive = Elektronik.expensive(emptyTastature, emptyUsb);
        assert unexpectedMostExpensive == -1 : "Test failed for expensive (unexpected case)";
    }
}
