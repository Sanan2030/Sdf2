package JavaMemExercise;

public class JavaMemExercise {

    public static void main(String[] args) {
        Person person = new Person("Test", 23); // Stack: person (referans)
        System.out.println(test(person)); // Stack: person (referans)
        System.out.println(person); // Stack: person (referans)
    }

    // Stack: person (referans), person (referans)
    private static int test(Person person) {
        person.setAge(25); // Heap: Person obyekti (yaş deyisdi: 23 -> 25)
        person = new Person("Test", 23); // Heap: Teze Person Obyekti yaradildi
        person.setName("Test2"); // Heap: Person obyektinin adi deyisdi ("Test" -> "Test2")
        return person.age; // Heap: Person Obyektinin yas deyeri  (25)
    }

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person name: " + this.name + ", age: " + this.age;
        }
    }
}
