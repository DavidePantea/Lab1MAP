import java.util.Arrays;

public class MethodeTests {
    public static void testNichtAusreichendeNoten() {
        int[] grades = {45, 53, 62, 37, 88, 95};
        int[] badGrades = Methode.nichtAusreichendeNoten(grades);
        assert Arrays.equals(badGrades, new int[]{37}) : "Test failed for nichtAusreichendeNoten (expected case)";

        int[] allPassingGrades = {75, 80, 90, 85};
        int[] unexpFailingGrades = Methode.nichtAusreichendeNoten(allPassingGrades);
        assert unexpFailingGrades.length == 0 : "Test failed for nichtAusreichendeNoten (unexpected case)";
    }

    public static void testAverage() {
        int[] allGrades = {80, 75, 90, 65, 92};
        int avg = Methode.average(allGrades);
        assert avg == 80 : "Test failed for average (expected case)";

        int[] emptyGrades = {};
        int unexpectedAvg = Methode.average(emptyGrades);
        assert unexpectedAvg == 0 : "Test failed for average (unexpected case)";
    }
}

