public class Elektronik {
    public static int cheaper(int input[]){
        int max = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] > max ){
                max = input[i];
            }
        }
        return max;
    }

    public static int expensive(int tastature[], int usb[]){
        int max = -1;

        for (int i = 0; i < tastature.length; i++) {
            if (tastature[i] > max) {
                max = tastature[i];
            }
        }

        for (int i = 0; i < usb.length; i++) {
            if (usb[i] > max) {
                max = usb[i];
            }
        }

        return max;
    }

    public static int budgetMax(int usb[], int budget){
        int max = -1;
        for (int i = 0; i < usb.length; i++) {
            if (usb[i] > max && usb[i] <= budget) {
                max = usb[i];
            }
        }
        return max;
    }

    public static int totalCost(int budget, int[] tastature, int[] usb) {
        int maxTotalCost = -1;

        for (int tastatur : tastature) {
            for (int usbPrice : usb) {
                int totalCost = tastatur + usbPrice;
                if (totalCost <= budget && totalCost > maxTotalCost) {
                    maxTotalCost = totalCost;
                }
            }
        }

        return maxTotalCost;
    }


}
