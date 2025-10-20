import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElectronicsShop electronicsShop = new ElectronicsShop();
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] usbs = {20,40,16, 70, 12,87};
        System.out.println("Cheapest keyboard : " + electronicsShop.cheapestKeyboard(keyboards));
        System.out.println("Most expensive item : " + electronicsShop.mostExpensiveproduct(keyboards, usbs));
    }
}