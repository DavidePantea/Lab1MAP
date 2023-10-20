public class Operations {

    public static int[] add(int[] first, int[] second){

        double res = toNumber(first) + toNumber(second);

        return toArray(res);
    }

    public static int[] subtract(int[] first, int[] second){

        double res = toNumber(first) - toNumber(second);

        return toArray(res);
    }

    public static int[] mult(int[] first, int second){
        double res = toNumber(first) * second;

        return toArray(res);
    }

    public static int[] div(int [] first, int second){

        double res = toNumber(first)/ second;

        return toArray(res);
    }


    public static double toNumber(int[] original){
        double number = 0;
        int mult = 0;
        for(int i = original.length-1; i >= 0; i --){
            number += Math.pow(10,mult) * original[i];
            mult ++;
        }
        return number;
    }

    public static int[] toArray(double in) {
        if (in == 0) {
            return new int[] { 0 };
        }

        int num = (int) Math.abs(in);  // Use Math.abs to handle negative numbers
        int numDigits = (int) Math.log10(num) + 1;  // Calculate the number of digits

        int[] result = new int[numDigits];

        for (int i = numDigits - 1; i >= 0; i--) {
            result[i] = num % 10;  // Extract the last digit
            num /= 10;  // Remove the last digit
        }

        return result;
    }

    public static int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];

        for(int i = 0; i < original.length; ++i) {
            result[i] = original[i];
        }

        result[original.length] = newElement;
        return result;
    }


}
