import java.util.Arrays;

public class MethodeTests {
    public static void testNichtAusreichendeNoten() {
        // Test case with some failing grades
        int[] grades1 = {45, 53, 62, 37, 88, 95};
        int[] badGrades1 = Methode.nichtAusreichendeNoten(grades1);
        assert Arrays.equals(badGrades1, new int[]{37}) : "Test failed for nichtAusreichendeNoten (expected case)";

        // Test case with all passing grades
        int[] allPassingGrades = {75, 80, 90, 85};
        int[] unexpFailingGrades = Methode.nichtAusreichendeNoten(allPassingGrades);
        assert unexpFailingGrades.length == 0 : "Test failed for nichtAusreichendeNoten (unexpected case)";
    }

    public static void testAverage() {
        // Test case with some grades
        int[] allGrades = {80, 75, 90, 65, 92};
        int avg = Methode.average(allGrades);
        assert avg == 80 : "Test failed for average (expected case)";

        // Test case with no grades
        int[] emptyGrades = {};
        int unexpectedAvg = Methode.average(emptyGrades);
        assert unexpectedAvg == 0 : "Test failed for average (unexpected case)";
    }

    public static void testAllRounded() {
        // Test case with some grades
        int[] grades = {45, 53, 62, 37, 88, 95};
        int[] roundedGrades = Methode.allRounded(grades);
        assert Arrays.equals(roundedGrades, new int[]{45, 55, 60, 37, 90, 95}) : "Test failed for allRounded";

        // Test case with no grades
        int[] emptyGrades = {};
        int[] emptyRoundedGrades = Methode.allRounded(emptyGrades);
        assert emptyRoundedGrades.length == 0 : "Test failed for allRounded (no grades)";
    }

    public static void testMaxRounded() {
        // Test case with some grades
        int[] grades = {45, 53, 62, 37, 88, 95};
        int maxRoundedGrade = Methode.maxRounded(grades);
        assert maxRoundedGrade == 95 : "Test failed for maxRounded (expected case)";

        // Test case with no grades
        int[] emptyGrades = {};
        int maxRoundedEmpty = Methode.maxRounded(emptyGrades);
        assert maxRoundedEmpty == 0 : "Test failed for maxRounded (no grades)";
    }
}
