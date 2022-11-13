public class Ex8ArrayRecord {
    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person("René", 1.82, true),
                new Person("Suzie", 1.68, false),
                new Person("William", 1.72, false),
                new Person("Anne", 1.77, true)
        };

        for (int i = 0; i < persons.length; ++i) {
            System.out.println(
                    persons[i].name() + ", taille: " + persons[i].height() + "m, majeur: " + persons[i].majority());
        }
    }
}
