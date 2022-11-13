public class Ex11MethodArrayCircle {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez donner une liste de rayons en argument");
            return;
        }

        for (String arg : args) {
            double radius = Integer.parseInt(arg);
            System.out.println("Rayon : " + radius + ", périmètre: " + perimeter(radius) + ", aire: " + area(radius));
        }
    }

    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
