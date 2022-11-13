public class Ex13MethodArgsPriceRecord {
    public static void main(String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Veuillez communiquer les prix et quantités");
        }

        int len = args.length / 2;
        PriceItem[] items = new PriceItem[len];

        for (int i = 0; i < len; ++i) {
            double price = Integer.parseInt(args[i]);
            int quantity = Integer.parseInt(args[len + i]);
            items[i] = new PriceItem(price, quantity);
        }

        System.out.println("Le prix total est " + totalPrice(items));
    }

    private static double totalPrice(PriceItem[] items) {
        double price = 0;
        for (PriceItem item : items) {
            price += item.price() * item.quantity();
        }
        return price;
    }
}
