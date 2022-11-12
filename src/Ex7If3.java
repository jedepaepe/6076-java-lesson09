public class Ex7If3 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x % 3 == 0) {
            System.out.println(x + " est un multiple de 3");
        } else {
            System.out.println(x + " n'est pas un multiple de 3");
        }
    }
}
