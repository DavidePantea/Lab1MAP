public class ElektronikTests {
    public static void testCheaper() {
        int[] prices = {50, 30, 75, 40};
        int cheapest = Elektronik.cheaper(prices);
        assert cheapest == 75 : "Test failed for cheaper (expected case)";

        int[] emptyPrices = {};
        int unexpectedCheapest = Elektronik.cheaper(emptyPrices);
        assert unexpectedCheapest == 0 : "Test failed for cheaper (unexpected case)";
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

    public static void testBudgetMax() {
        int[] usb = {30, 40, 50, 60, 70};
        int budget = 55;
        int maxBudgetPrice = Elektronik.budgetMax(usb, budget);
        assert maxBudgetPrice == 50 : "Test failed for budgetMax (expected case)";

        int[] emptyUsb = {};
        int maxBudgetPriceEmpty = Elektronik.budgetMax(emptyUsb, budget);
        assert maxBudgetPriceEmpty == -1 : "Test failed for budgetMax (unexpected case)";
    }

    public static void testTotalCost() {
        int budget = 60;
        int[] tastature = {30, 40, 20};
        int[] usb = {25, 35, 15};
        int maxTotalCost = Elektronik.totalCost(budget, tastature, usb);
        assert maxTotalCost == 55 : "Test failed for totalCost (expected case)";

        int[] tastature2 = {30, 40, 20};
        int[] usb2 = {25, 35, 70};
        int maxTotalCost2 = Elektronik.totalCost(budget, tastature2, usb2);
        assert maxTotalCost2 == 60 : "Test failed for totalCost (unexpected case)";
    }

    public static void main() {
        testCheaper();
        testExpensive();
        testBudgetMax();
        testTotalCost();
    }
}
