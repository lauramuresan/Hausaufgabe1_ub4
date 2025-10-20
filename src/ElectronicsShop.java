public class ElectronicsShop {

    public int cheapestKeyboard(int[] KeyboardsPrices) {

        if (KeyboardsPrices.length == 0)
            throw new IllegalArgumentException("Invalid Input");

        int minPrice = KeyboardsPrices[0];
        for (int i = 1; i < KeyboardsPrices.length; i++) {
            if (KeyboardsPrices[i] < minPrice)
                minPrice = KeyboardsPrices[i];
        }
        return minPrice;
    }

    public int mostExpensiveproduct(int[] KeyboardsPrices, int[] usbPrices) {

        if (KeyboardsPrices.length == 0 &&  usbPrices.length == 0)
            throw new IllegalArgumentException("Invalid Input");

        int maxPrice = -1;
        for (int i = 1; i < KeyboardsPrices.length; i++) {
            if(KeyboardsPrices[i] > maxPrice)
                maxPrice = KeyboardsPrices[i];
        }

        for (int i = 0; i < usbPrices.length; i++) {
            if(usbPrices[i] > maxPrice)
                maxPrice = usbPrices[i];
        }
        return maxPrice;
    }

    public int mostExpensiveUSB(int[] UsbPrices, int budget){
        int maxPrice = -1 ;
        for (int i = 0; i < UsbPrices.length; i++) {
            if(UsbPrices[i] > maxPrice && UsbPrices[i] <= budget)
                maxPrice = UsbPrices[i];
        }

        return maxPrice;
    }

    public int Keyboard_and_usb(int[] keyboards, int[] usbs, int budget) {
        int maxBudget = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < usbs.length; j++) {
                int sum = keyboards[i] + usbs[j];
                if(sum > maxBudget && sum <= budget)
                    maxBudget = sum;
            }
        }

        return maxBudget;
    }
}
