package sections.sec34b_method_overloading_types;

class Student {
    public void studentInfo(int id, String name) {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public void studentInfo(String name, int id) {
        System.out.println("Name: " + name + " ID: " + id);
    }
}
public class ChangingOrderOfParams {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentInfo(1, "Ahmet");
        student.studentInfo("Carl", 2);
    }
}
