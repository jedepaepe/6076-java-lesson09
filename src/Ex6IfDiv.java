public class Ex6IfDiv {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (b == 0) {
            System.out.println(a + " + " + b + " = infini");
        } else {
            System.out.println(a + " + " + b + " = " + a / b);
        }
    }
}
