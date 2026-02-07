package sections.sec44_Inheritance;

public class Manager extends Employee {
    private int numOfEmployees;

    public Manager(String name, String department, int salary, int numOfEmployees) {
        super(name, department, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public void raiseSalary(int amount) {
        System.out.println("Salary raised: " + amount);
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Manager responsible for " + numOfEmployees + " person");
    }

    @Override
    public String toString() {
        return "Manager name: " + getName();        // Employee classındaki name bu class'da geçerli olmuş olsa da direkt "name" şeklinde alamayuz. Employee'de getter işlemiyle oluşturulan "getName" i alarak kullanabiliriz
    }
}
