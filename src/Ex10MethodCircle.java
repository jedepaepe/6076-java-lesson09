public class Ex10MethodCircle {
    public static void main(String[] args) {
        double r = 10;
        System.out.println("Rayon : " + r + ", périmètre: " + perimeter(r) + ", aire: " + area(r));
    }

    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
