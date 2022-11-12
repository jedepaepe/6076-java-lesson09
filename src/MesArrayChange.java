public class MesArrayChange {
    public static void main(String[] args) {
        // initialisation des arrays
        int[] diameters = new int[3];           // diameters contient { 0, 0, 0 }
        String[] firstNames = new String[4];    // firstNames contient { 0, 0, 0, 0 }
                                                //      que l'on écrit { null, null, null, null }
                                                //          car String est un type référencé
                                                // cela signifie qu'il ne contient aucune String (aucun texte)
                                                // même pas un texte vide ""

        // assignons des valeurs aux éléments des deux tableaux:
        diameters[0] = 10;
        diameters[1] = 20;
        diameters[2] = 15;
        firstNames[0] = "Julie";
        firstNames[1] = "Charles";
        firstNames[2] = "Suza";
        firstNames[3] = "Olivier";

        for(int diameter : diameters) {
            System.out.println(diameter);
        }
        for (String firstName : firstNames) {
            System.out.println(firstName);
        }
    }
}
