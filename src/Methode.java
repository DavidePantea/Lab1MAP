import java.util.Arrays;

public class Methode{
    public static int[] nichtAusreichendeNoten(int[] note) {

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) < 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public static int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public static int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public static int average(int[] note){
        int avg = 0;
        if(note.length == 0){
            return avg;
        }
        for (int i = 0; i < note.length; i++) {
            avg += note[i];
        }
        return avg/(note.length) ;
    }

    public static int[] allRounded(int[] note){
        int[] finaleNoten = new int[0];
        for (int i = 0; i < note.length; i++) {
            finaleNoten = addToArray(finaleNoten, round(note[i]));
        }
        return finaleNoten;
    }

    public static int maxRounded(int[] note){
        note = allRounded(note);
        int max = 0;
        for(int i = 0; i < note.length; i++ ){
            if(note[i] > max){
                max = note[i];
            }
        }
        return max;
    }
}

