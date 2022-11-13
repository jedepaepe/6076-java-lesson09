public class Ex9Array {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez donner une liste d'entiers");
            return;
        }
        int[] values = new int[args.length];

        for (int i = 0; i < args.length; ++i) {
            values[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < values.length - 1; ++i) {
            System.out.println(values[i] + " + " + values[i + 1] + " = " + (values[i] + values[i + 1]));
        }
    }
}
