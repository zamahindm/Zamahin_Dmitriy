package ru.mirea.task3.formats.number1;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class CurrencyConverter {
    private NumberFormat currencyFormat;

    public CurrencyConverter() {
        currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    }

    public String formatCurrency(double amount) {
        return currencyFormat.format(amount);
    }

    public String formatCurrency(double amount, String currencyCode) {
        DecimalFormat decimalFormat = new DecimalFormat(currencyCode + " #,##0.00");
        return decimalFormat.format(amount);
    }

    public double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        double amountUSD = 1000.0;
        double exchangeRate = 0.85; // Example exchange rate from USD to EUR

        System.out.println("Сумма в долларах США: " + converter.formatCurrency(amountUSD));
        System.out.println("Сумма в евро: " + converter.formatCurrency(converter.convertCurrency(amountUSD, exchangeRate), "EUR"));
    }
}

