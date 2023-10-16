import java.util.Arrays;
public class Tests {
    public static void test1() {
        // Test nichtAusreichendeNoten method
        int[] grades = {45, 53, 62, 37, 88, 95};
        int[] failingGrades = Methode.nichtAusreichendeNoten(grades);
        assert Arrays.equals(failingGrades, new int[]{37}) : "Test failed for nichtAusreichendeNoten";

        // Test average method
        int[] allGrades = {80, 75, 90, 65, 92};
        int avg = Methode.average(allGrades);
        assert avg == 80 : "Test failed for average";

        // Test allRounded method
        int[] roundedGrades = Methode.allRounded(allGrades);
        assert Arrays.equals(roundedGrades, new int[]{80, 75, 90, 65, 92}) : "Test failed for allRounded";

        // Test maxRounded method
        int maxRoundedGrade = Methode.maxRounded(allGrades);
        assert maxRoundedGrade == 90 : "Test failed for maxRounded";

        System.out.println("All tests passed.");
    }

    public static void test2() {
        // Test maxNumber method
        int[] array = {10, 25, 5, 35, 15};
        int max = Zahlen.maxNumber(array);
        assert max == 35 : "Test failed for maxNumber";

        // Test minNumber method
        int min = Zahlen.minNumber(array);
        assert min == 5 : "Test failed for minNumber";

        // Test bigger method
        int sumWithoutMin = Zahlen.bigger(array);
        assert sumWithoutMin == 75 : "Test failed for bigger";

        // Test smaller method
        int sumWithoutMax = Zahlen.smaller(array);
        assert sumWithoutMax == 55 : "Test failed for smaller";

        System.out.println("All tests passed.");
    }

    public static void test3() {
        // Test add method
        int[] first = Operations.toArray(123);
        int[] second = Operations.toArray(456);
        int[] sum = Operations.add(first, second);
        assert Operations.toNumber(sum) == 579 : "Test failed for add";

        // Test subtract method
        int[] difference = Operations.subtract(first, second);
        assert Operations.toNumber(difference) == -333 : "Test failed for subtract";

        // Test mult method
        int[] product = Operations.mult(first, 3);
        assert Operations.toNumber(product) == 369 : "Test failed for mult";

        // Test div method
        int[] division = Operations.div(first, 3);
        assert Operations.toNumber(division) == 41 : "Test failed for div";

        System.out.println("All tests passed.");
    }

    public static void test4() {
        // Test cheaper method
        int[] prices = {50, 30, 75, 40};
        int cheapest = Elektronik.cheaper(prices);
        assert cheapest == 75 : "Test failed for cheaper";

        // Test expensive method
        int[] tastature = {30, 20, 40};
        int[] usb = {25, 35, 15};
        int mostExpensive = Elektronik.expensive(tastature, usb);
        assert mostExpensive == 40 : "Test failed for expensive";

        // Test budgetMax method
        int[] usbPrices = {25, 35, 15};
        int budget = 50;
        int maxCost = Elektronik.budgetMax(usbPrices, budget);
        assert maxCost == 35 : "Test failed for budgetMax";

        // Test totalCost method
        int[] tastaturePrices = {30, 20, 40};
        int[] usbPrices2 = {25, 35, 15};
        int budget2 = 60;
        int maxTotalCost = Elektronik.totalCost(budget2, tastaturePrices, usbPrices2);
        assert maxTotalCost == 55 : "Test failed for totalCost";

        System.out.println("All tests passed.");
    }
}
