package com.OOP;

/**
 *
 * Создать класс Person. Осуществить наследование этого класса в классах,
 *             созданных в пунктах 2.1 и 2.2.
 *             Подумать какие поля могут общими для классов Employee и Student и перенести их в Person.
 *
 */
public class Person {
    protected int age;
    protected String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String a){
        name = a;
    }
}
