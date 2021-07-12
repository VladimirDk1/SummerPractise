package com.OOP;

/**
 *
 * Создать класс Student, который должен содержать поля: age, name, university,
 *             наличие стипендии (grants).
 *
 */
public class Student extends Person implements OutDat {
    private String university;
    double grants;
    public String getUniversity(){
        return university;
    }
    public double getGrants(){
        return grants;
    }
    public void setUniversity(String a){
        university = a;
    }
    public void setGrants(double a){
        grants = a;
    }

    // Реализация метода из интерфейса
    public void outDat(){
        System.out.println(name + " " + university);
    }

    // Реализовать возможность вывода читаемой информации из объекта (переопределить метод toString).
    @Override
    public String toString() {
        return "Имя " + name + "; Возраст " + age + "; Университет " + university + "; Стипендия " + grants;
    }
}
