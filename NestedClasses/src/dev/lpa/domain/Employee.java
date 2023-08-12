package dev.lpa.domain;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted - o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private String name;
    private int yearStarted;
    private int employeeId;

    public Employee() {}

    public Employee(String name, int yearStarted, int employeeId) {
        this.name = name;
        this.yearStarted = yearStarted;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId,name,yearStarted);
    }
}
