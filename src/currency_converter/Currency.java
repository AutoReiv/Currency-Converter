package currency_converter;

// Takes command-line input and converts between currencies
// Supports USD, GBP, and MXN
// Input should be in form "*from* *amount* *to*
public class Currency {
    public static void main(String[] args) {
        // store the amount of currency to convert from
        double amount = Double.parseDouble(args[1]);

        // store currency converting from / to
        String from = args[0], to = args[2];

        convert(amount, from, to);
    }

    static void convert(double amount, String from, String to) {
        if (from.equals("USD") && to.equals("GBP")) { // USD to GBP
            System.out.println(amount * 0.64);
        } else if (from.equals("GBP") && to.equals("USD")) { // GBP to USD
            System.out.println(amount * 1.56);
        } else if (from.equals("USD") && to.equals("MXN")) { // USD to MXN
            System.out.println(amount * 15.93);
        } else if (from.equals("MXN") && to.equals("USD")) { // MXN to USD
            System.out.println(amount * 0.063);
        } else if (from.equals("GBP") && to.equals("MXN")) { // GBP to MXN
            System.out.println(amount * 24.85);
        } else if (from.equals("MXN") && to.equals("GBP")) { // MXN to GBP
            System.out.println(amount * 0.04);
        } else {
            System.out.println("Conversion failed");
        }
    }
}