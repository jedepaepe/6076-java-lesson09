public class Ex8Array {
    public static void main(String[] args) {
        String[] names = { "René", "Suzie", "William", "Anne" };
        double[] heights = { 1.82, 1.68, 1.72, 1.77 };
        boolean[] majors = { true, false, false, true };

        for (int i = 0; i < heights.length; ++i) {
            System.out.println(names[i] + ", taille: " + heights[i] + "m, majeur: " + majors[i]);
        }
    }
}
