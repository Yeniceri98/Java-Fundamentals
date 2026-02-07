package sections.sec99_algorithms_livecoding_practice.oop_scenarios.Inheritance_Polymorpihsm;

import java.math.BigDecimal;
import java.util.List;

public class PayrollCalculation {
    static abstract class Employee {
        private final String name;

        Employee(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        abstract BigDecimal calculateSalary();
    }

    static class FullTimeEmployee extends Employee {
        private final BigDecimal monthlySalary;

        FullTimeEmployee(String name, BigDecimal monthlySalary) {
            super(name);
            this.monthlySalary = monthlySalary;
        }

        @Override
        BigDecimal calculateSalary() {
            return monthlySalary;
        }
    }

    static class Contractor extends Employee {
        private final BigDecimal hourlyRate;
        private final int hours;

        Contractor(String name, BigDecimal hourlyRate, int hours) {
            super(name);
            this.hourlyRate = hourlyRate;
            this.hours = hours;
        }

        @Override
        BigDecimal calculateSalary() {
            return hourlyRate.multiply(BigDecimal.valueOf(hours));
        }
    }

    static class PayrollService {
        BigDecimal totalPayroll(List<Employee> employees) {
            BigDecimal total = BigDecimal.ZERO;

            for (Employee employee : employees) {
                total = total.add(employee.calculateSalary());
            }

            return total;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new FullTimeEmployee("Ahmet", new BigDecimal("80.000")),
                new Contractor("John", new BigDecimal("500"), 100)
        );

        PayrollService payrollService = new PayrollService();
        System.out.println("Total Payroll: " + payrollService.totalPayroll(employees));
    }
}
