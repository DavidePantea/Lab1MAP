public class Zahlen {
    public static int maxNumber(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }

    public static int minNumber(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min ){
                min = array[i];
            }
        }
        return min;
    }

    public static int bigger(int[] array){
        int min = minNumber(array);
        int big = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == min){
                continue;
            }
            big += array[i];
        }
        return big;
    }

    public static int smaller(int[] array){
        int max = maxNumber(array);
        int big = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                continue;
            }
            big += array[i];
        }
        return big;
    }
}
