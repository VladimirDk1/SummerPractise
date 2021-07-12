package com.OOP;

/**
 * Создать класс Employee, который должен содержать поля: age, name, department
 *             (отдел где работает конкретный человек), salary, nameCat (имя кота).
 *             Реализовать возможность создавать сотрудников у которых есть кот
 *             и сотрудников у которых кота нет. 	Создать трех сотрудников,
 *             у одного сотрудника должен быть кот по кличке «Рыжий».
 */

public class Employee extends Person implements OutDat {
    private String department, nameCat;
    private double salary;

    public Employee(){}
    public Employee(int a, String nam, String dep, String namC, double sal){
        age = a;
        name = nam;
        department = dep;
        nameCat = namC;
        salary = sal;
    }

    public String getDepartment(){
        return department;
    }

    public String getNameCat(){
        return nameCat;
    }

    public double getSalary(){
        return salary;
    }

    public void setDepartment(String a){
        department = a;
    }

    public void setNameCat(String a){
        nameCat = a;
    }

    public void setSalary(double a){
        salary = a;
    }

    // Реализация метода из интерфейса
    public void outDat(){
        System.out.println(name + " " + department + " " + nameCat);
    }

    // Реализовать возможность вывода читаемой информации из объекта (переопределить метод toString).
    @Override
    public String toString() {
        return "Имя " + name + "; Возраст " + age + "; Департамент " + department + "; Имя кота " + nameCat +
                "; Размер зарплаты " + salary;
    }

    // Это переопределение методов из главы про коллекции
    /*
    Переопределить методы equals и hashcode в классе Employee и вновь вывести на консоль объекты,
    созданные в пунктах 3.1 – 3.3. Проанализировать полученный результат.

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Employee employee = (Employee) obj;
        return name == employee.name & age == employee.age & nameCat == employee.nameCat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((nameCat == null) ? 0 : nameCat.hashCode());
        return result;
    }
    */
}
