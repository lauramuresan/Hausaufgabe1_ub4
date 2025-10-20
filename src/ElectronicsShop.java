public class ElectronicsShop {

    public int cheapestKeyboard(int[] KeyboardsPrices) {
        if (KeyboardsPrices.length == 0)
            throw new IllegalArgumentException("Invalid Input");

        int minPrice = KeyboardsPrices[0];
        for(int i = 1; i < KeyboardsPrices.length; i++){
            if(KeyboardsPrices[i] < minPrice)
                minPrice = KeyboardsPrices[i];
        }
        return minPrice;
    }
}
