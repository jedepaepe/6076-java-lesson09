public class MesArrays {
    public static void main(String[] args) {
        int[] diameters = { 10, 20, 15 };
        String[] firstNames = { "Julie",  "Charles", "Suza", "Olivier" };

        System.out.println("la propriété length donne le nombre d'éléments dans l'array");
        System.out.println(diameters.length);
        System.out.println(firstNames.length);

        System.out.println("\n[index] permet d'accéder à l'élément d'index de l'array");
        System.out.println(diameters[0]);
        System.out.println(diameters[1]);
        System.out.println(diameters[2]);
        System.out.println(firstNames[0]);
        System.out.println(firstNames[1]);
        System.out.println(firstNames[2]);
        System.out.println(firstNames[3]);

        System.out.println("\nLa boucle for permet de parcourir le tableau");
        for (int i = 0; i < diameters.length; ++i) {
            System.out.println(diameters[0]);
        }
        for (int i = 0; i < firstNames.length; ++i) {
            System.out.println(firstNames[0]);
        }

        System.out.println("\nCependant, il est plus facile d'utiliser 'for each'");
        for (int d : diameters) {
            System.out.println(d);
        }
        for (String fn : firstNames) {
            System.out.println(fn);
        }
    }
}
