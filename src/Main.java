import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Methode notenProzessor = new Methode();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        System.out.println(Arrays.toString(Methode.nichtAusreichendeNoten(noten)));
        System.out.println(Methode.average(noten));
        System.out.println(Arrays.toString(Methode.allRounded(noten)));
        System.out.println(Methode.maxRounded(noten));

        System.out.println(Zahlen.minNumber(noten));
        System.out.println(Zahlen.maxNumber(noten));
    }
}