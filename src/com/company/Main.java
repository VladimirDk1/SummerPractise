package com.company;

import JavaCore.JavaCoreMethods;
import com.Collect.workСollections;
import com.OOP.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //                  Это из главы про java core
        System.out.println("Вызов метода evaluatingExpression при значениях 1, 2, 3, 4: " +
                JavaCoreMethods.evaluatingExpression(1, 2, 3, 4));
        System.out.println("Вызов метода evaluatingExpression при значениях 1, 2, 3, 0: " +
                JavaCoreMethods.evaluatingExpression(1, 2, 3, 0));

        System.out.println();
        System.out.println("Вызов метода sumLimit10And20 при значениях 1, 20: " +
                JavaCoreMethods.sumLimit10And20(1, 20));
        System.out.println("Вызов метода sumLimit10And20 при значениях 10, 9: " +
                JavaCoreMethods.sumLimit10And20(10, 9));
        System.out.println("Вызов метода sumLimit10And20 при значениях 0, 10: " +
                JavaCoreMethods.sumLimit10And20(0, 10));

        System.out.println();
        System.out.println("Вызов метода definingNegativeAndPositiveNumber при значении 3: ");
        JavaCoreMethods.definingNegativeAndPositiveNumber(3);
        System.out.println("Вызов метода definingNegativeAndPositiveNumber при значении 0: ");
        JavaCoreMethods.definingNegativeAndPositiveNumber(0);
        System.out.println("Вызов метода definingNegativeAndPositiveNumber при значении -1: ");
        JavaCoreMethods.definingNegativeAndPositiveNumber(-1);

        System.out.println();
        System.out.println("Вызов метода definingNegativeNumber при значении 10: " +
                JavaCoreMethods.definingNegativeNumber(10));
        System.out.println("Вызов метода definingNegativeNumber при значении 0: " +
                JavaCoreMethods.definingNegativeNumber(0));
        System.out.println("Вызов метода definingNegativeNumber при значении -5: " +
                JavaCoreMethods.definingNegativeNumber(-5));

        System.out.println();
        System.out.println("Вызов метода outputtingGreetingToConsole при значении Владимир: ");
                JavaCoreMethods.outputtingGreetingToConsole("Владимир");
        System.out.println("Вызов метода outputtingGreetingToConsole при значении Виктория: ");
                JavaCoreMethods.outputtingGreetingToConsole("Виктория");



        //              Это из главы про ООП
        System.out.println();
        Employee vol = new Employee(21, "Владимир", "Разработка", "Мелкий", 30000);
        Employee al = new Employee(21, "Алексей", "Разработка", "", 30000);
        Employee vic = new Employee(21, "Виктория", "Разработка", "Рыжий", 30000);

        System.out.println("Имя кошки до изменения " + vic.getNameCat());
        vic.setNameCat("Мурка");
        System.out.println("Имя кошки после изменения " + vic.getNameCat());


        System.out.println(vol);

        System.out.println();


        //                  Это из главы про коллекции

        // Задание
        /*
        Создать объекты класса Employee employee1 и employee2, поля этих объектов
        должны быть одинаковы (одинаковое имя, возраст и т.д.)
        3.1 Создать объект ArrayList типа List. Код будет представлен на рисунке 8.
        3.2 Создать объект HashSet типа Set. Код будет представлен на рисунке 8.
        3.3 Создать объект HashMap типа Map. В качестве key принять тип Employee,
        в качестве value любой тип, любое значение.
        3.4 Поместить в созданные объекты коллекций объекты employee1 и employee2,
                вывести объекты коллекций на консоль.
        3.5 Переопределить методы equals и hashcode в классе Employee и вновь вывести
        на консоль объекты созданные в пунктах 3.1 – 3.3. Проанализировать полученный результат.*/

        Employee vol1 = new Employee(21, "Владимир", "Разработка", "Мелкий", 30000);
        Employee vol2 = new Employee(21, "Владимир", "Разработка", "Мелкий", 30000);

        ArrayList<Employee> arrayList = new ArrayList<>();
        HashSet<Employee> hashSet = new HashSet<>();
        HashMap<Employee, Integer> hashMap = new HashMap<>();

        arrayList.add(vol);
        arrayList.add(vol1);
        System.out.println("Данные класса ArrayList");
        for (Employee e: arrayList) {
            System.out.println(e);
        }

        boolean tr = hashSet.add(vol);
        boolean tr1 = hashSet.add(vol1);
        System.out.println("Данные класса HashSet");
        for (Employee e: hashSet) {
            System.out.println(e);
        }

        hashMap.put(vol, 1);
        hashMap.put(vol1, 2);
        System.out.println("Данные класса HashMap");
        for (Map.Entry<Employee, Integer> e: hashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println();


        //                      Это из главы про лямбды и стримы

        // Задание
            /*
            Создать три разных объекта класса Employee с любыми значениями полей и поместить их в ArrayList
            С помощью лямбда выражений и стримов:
	        Отсортировать их по имени и вывести на экран
            Вывести только тех сотрудников, у которых зарплата выше среднего.
             */

        Employee employeeVol = new Employee(21, "Владимир", "Разработка", "Мелкий", 30000);
        Employee employeeAl = new Employee(21, "Алексей", "Разработка", "", 25000);
        Employee employeeVic = new Employee(21, "Виктория", "Разработка", "Рыжий", 15000);

        ArrayList<Employee> arrayList1 = new ArrayList<>();
        arrayList.add(employeeVol);
        arrayList.add(employeeAl);
        arrayList.add(employeeVic);

        System.out.println("Отсортировать сотрудников по имени:");
        workСollections compar = new workСollections();
        arrayList.stream().sorted(compar).forEach(s -> System.out.println(s));
        System.out.println();

        System.out.println("Вывести только тех сотрудников, у которых зарплата выше 25000: ");
        arrayList.stream().filter(f -> f.getSalary() >= 25000).forEach(s -> System.out.println(s));
    }
}
