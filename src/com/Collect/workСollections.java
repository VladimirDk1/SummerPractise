package com.Collect;
/**
 * Класс для сортировки объектов класса Employee в коллекции
 */

import com.OOP.*;

import java.util.Comparator;

public class workСollections implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
