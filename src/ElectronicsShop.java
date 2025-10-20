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
        int maxPrice = KeyboardsPrices[0];
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
}
