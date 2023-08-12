package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.EmployeeComparator;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee("megha", 2019, 100, "Big Bazar"),
                new StoreEmployee("Joy", 2021, 101, "D Mart"),
                new StoreEmployee("Til Sa", 2020, 103, "Wallmart")
        ));
       var c0 = new EmployeeComparator<StoreEmployee>();
//       var c1 = new StoreEmployee().new EmployeeComparator<StoreEmployee>();

       sortIt(storeEmployees, c0);
//       sortIt(storeEmployees, c1);
    }

        public static <T> void sortIt(List<T> list, Comparator<? super  T> comparator) {

            System.out.println("Sorting with Comparator: " + comparator.toString());
            list.sort(comparator);
            for (var employee : list) {
                System.out.println(employee);
            }
        }
    }

