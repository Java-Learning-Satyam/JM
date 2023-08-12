package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bhanu", 2015, 1));
        employees.add(new Employee("Aditi", 2016, 2));
        employees.add(new Employee("Ralph", 2017, 3));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        for (Employee em : employees) {
            System.out.println(em);
        }

        System.out.println("Store Employee");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee("megha", 2019, 100, "Big Bazar"),
                new StoreEmployee("Joy", 2021, 101, "D Mart"),
                new StoreEmployee("Til Sa", 2020, 103, "Wallmart")
        ));
        var geneericEmployee = new StoreEmployee();
        var comparator = geneericEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee emp : storeEmployees) {
            System.out.println(emp);
        }
    }

    public static void addPigLatinName(List<? extends StoreEmployee> list) {

        class DecoratedEmployee extends StoreEmployee {

            private String pigLatinName;
            private Employee orignalInstance;

            public DecoratedEmployee(String pigLatinName, Employee orignalInstance) {
                this.pigLatinName = pigLatinName;
                this.orignalInstance = orignalInstance;
            }

            @Override
            public String toString() {
                return orignalInstance.toString() + " " + pigLatinName;
            }
        }


        List<DecoratedEmployee> newList = new ArrayList<>(list.size());


    }
}
