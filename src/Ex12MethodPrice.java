public class Ex12MethodPrice {
    public static void main(String[] args) {
        double[] prices = { 100, 10 };
        int[] quantities = { 1, 10 };

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
