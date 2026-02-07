package sections.sec64_pass_by_value;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class MainTwo {
    public static void main(String[] args) {
        Person firstPerson = new Person("Ahmet");
        Person secondPerson = firstPerson;             // NOTE: Referans kopyalanmış olur. firstPerson ile secondPerson aynı objeyi gösterir. Birinde yapılan diğerini de etkiler

        secondPerson.setName("Sami");
        System.out.println(firstPerson.getName());     // Sami
        System.out.println(secondPerson.getName());    // Sami

        secondPerson = new Person("Yeniçeri");         // NOTE: Yeni objeye yönelir. firstPerson etkilenmez
        System.out.println(firstPerson.getName());     // Sami
        System.out.println(secondPerson.getName());    // Yeniçeri
    }
}
