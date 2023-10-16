import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Methode notenProzessor = new Methode();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        //EX 1.
        System.out.println(Arrays.toString(Methode.nichtAusreichendeNoten(noten)));
        System.out.println(Methode.average(noten));
        System.out.println(Arrays.toString(Methode.allRounded(noten)));
        System.out.println(Methode.maxRounded(noten));

        //EX 2.
        System.out.println(Zahlen.minNumber(noten));
        System.out.println(Zahlen.maxNumber(noten));
        System.out.println(Zahlen.smaller(noten));
        System.out.println(Zahlen.bigger(noten));

        //EX 3.
        int[] first = new int[] { 9, 9, 9};
        int[] second = new int[] { 1, 2, 3};
        System.out.println(Arrays.toString(Operations.add(first, second)));
        System.out.println(Arrays.toString(Operations.subtract(first, second)));
        System.out.println(Arrays.toString(Operations.mult(first, 2)));
        System.out.println(Arrays.toString(Operations.div(first, 2)));

        //EX 4.
        int[] usb = new int[] { 99, 19, 79};
        int[] tastatur = new int[] { 14, 24, 33};
        System.out.println(Elektronik.cheaper(usb));
        System.out.println(Elektronik.expensive(usb, tastatur));
        System.out.println(Elektronik.budgetMax(usb, 16));
        System.out.println(Elektronik.totalCost(99,usb, tastatur));


    }
}