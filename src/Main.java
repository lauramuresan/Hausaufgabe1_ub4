import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElectronicsShop electronicsShop = new ElectronicsShop();
        int[] keyboards = {60, 56, 51, 12, 91, 11};
        int[] usbs = {8,12, 2, 8};
        int budget = 60;
        System.out.println("Cheapest keyboard : " + electronicsShop.cheapestKeyboard(keyboards));
        System.out.println("Most expensive item : " + electronicsShop.mostExpensiveproduct(keyboards, usbs));
        System.out.println("Most expensive USB on budget : " + electronicsShop.mostExpensiveUSB(usbs, budget));
        System.out.println("Most expensive pair Keyboard-USB on budget : " + electronicsShop.Keyboard_and_usb(keyboards, usbs, budget));
    }
}