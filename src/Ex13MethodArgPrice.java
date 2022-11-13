public class Ex13MethodArgPrice {
    public static void main(String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Veuillez communiquer les prix et quantités");
        }

        int len = args.length / 2;
        double[] prices = new double[len];
        int[] quantities = new int[len];

        for (int i = 0; i < len; ++i) {
            prices[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < len; ++i) {
            quantities[i] = Integer.parseInt((args[len + i]));
        }

        System.out.println("Le prix total est " + totalPrice(prices, quantities));
    }

    private static double totalPrice(double[] prices, int[] quantities) {
        double price = 0;
        for (int i = 0; i < prices.length; ++i) {
            price += prices[i] * quantities[i];
        }
        return price;
    }
}
