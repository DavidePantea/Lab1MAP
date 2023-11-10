import java.util.Arrays;
public class Operations {

    public static int[] add(int[] first, int[] second) {
        int maxLength = Math.max(first.length, second.length);
        int[] result = new int[maxLength + 1] ;
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int sum = (i < first.length ? first[i] : 0) + (i < second.length ? second[i] : 0) + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            result[maxLength] = carry;
        }

        return trimLeadingZeros(result);
    }

    public static int[] subtract(int[] first, int[] second) {
        int maxLength = Math.max(first.length, second.length);
        int[] result = new int[maxLength];
        int borrow = 0;

        for (int i = 0; i < maxLength; i++) {
            int op1 = (i < first.length ? first[i] : 0) - borrow;
            int op2 = (i < second.length ? second[i] : 0);
            if (op1 < op2) {
                op1 += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = op1 - op2;
        }

        return trimLeadingZeros(result);
    }

    public static int[] mult(int[] first, int second) {
        int[] result = new int[first.length + 1];
        int carry = 0;

        for (int i = 0; i < first.length; i++) {
            int product = (first[i] * second) + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            result[first.length] = carry;
        }

        return trimLeadingZeros(result);
    }

    public static int[] div(int[] first, int second) {
        int[] result = new int[first.length];
        int dividend = 0;

        for (int i = 0; i < first.length; i++) {
            int currentDigit = first[i] + dividend * 10;
            result[i] = currentDigit / second;
            dividend = currentDigit % second;
        }

        return trimLeadingZeros(result);
    }

    // Helper method to trim leading zeros from the result
    private static int[] trimLeadingZeros(int[] input) {
        int startIndex = 0;
        while (startIndex < input.length && input[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex == input.length) {
            return new int[]{0}; // Result is zero
        }

        return Arrays.copyOfRange(input, startIndex, input.length);
    }
}
