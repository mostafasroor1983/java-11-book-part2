package questions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

public class Wallet {
    private double money;

    public Wallet(double money) {
        this.money = money;
    }

    private String openWallet() {
        Locale.setDefault(Category.DISPLAY,
                new Locale.Builder().setRegion("us").build());
        Locale.setDefault(Category.FORMAT,
                new Locale.Builder().setLanguage("en").build());
        return NumberFormat.getCurrencyInstance(Locale.GERMANY)
                        .format(money);
    }

    public void printBalance() {
        System.out.println(openWallet());
    }

    public static void main(String... a) {
        new Wallet(2.4d).printBalance();
    }
}