import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElectronicsShop electronicsShop = new ElectronicsShop();
        int[] keyboards = {40, 35, 70, 15, 45};
        System.out.println(electronicsShop.cheapestKeyboard(keyboards));
    }
}