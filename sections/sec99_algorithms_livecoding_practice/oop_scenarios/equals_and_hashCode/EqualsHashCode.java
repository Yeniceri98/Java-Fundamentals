package sections.sec99_algorithms_livecoding_practice.oop_scenarios.equals_and_hashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
    Person(id, name) ile HashSet içinde duplicate engelle.
    equals / hashCode doğru yaz (id üzerinden)
*/

public class EqualsHashCode {
    static class Person {
        private final Long id;
        private final String name;

        Person(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        Long getId() {
            return id;
        }

        String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person other = (Person) o;

            // id null ise equality risklidir; genelde null id'li entity set'e sokulmaz
            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Person{id=" + id + ", name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person(1L, "Ahmet"));
        set.add(new Person(1L, "Ahmet Duplicate"));
        set.add(new Person(2L, "Mehmet"));

        System.out.println(set.size()); // 2
        System.out.println(set);
    }
}
