package shildt.book.exampleServiceClass;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by luchk on 11.03.2016.
 */
public class CurrencyDemo {
    public static void main(String[] args) {
        Currency currency;
        currency = Currency.getInstance(Locale.CHINA);

        System.out.println("Символ: " + currency.getSymbol());
        System.out.println("Количество дробных разрядов по умолчанию: " + currency.getDefaultFractionDigits());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getDisplayName());
    }
}
