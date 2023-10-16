public class Operations {
    public static int[] add(int[] first, int[] second){

        int res = toNumber(first) + toNumber(second);

        return toArray(res);
    }

    public static int[] subtract(int[] first, int[] second){

        int res = toNumber(first) - toNumber(second);

        return toArray(res);
    }

    public static int[] mult(int[] first, int second){
        int res = toNumber(first) * second;

        return toArray(res);
    }

    public static int[] div(int[] first, int second){

        int res = toNumber(first)/ second;

        return toArray(res);
    }


    public static int toNumber(int[] original){
        int number = 0;
        int mult = 0;
        for(int i = original.length-1; i >= 0; i --){
            number += Math.pow(10,mult) * original[i];
            mult ++;
        }
        return number;
    }

    public static int[] toArray(int in) {
        if (in == 0) {
            return new int[] { 0 };
        }

        int count = 0;
        int number = in;
        while (number != 0) {
            number /= 10;
            count++;
        }

        int[] result = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            result[i] = in % 10;
            in /= 10;
        }

        return result;
    }


}
