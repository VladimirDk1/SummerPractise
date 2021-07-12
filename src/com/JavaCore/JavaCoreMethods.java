package JavaCore;

/**
 * Методы для раздела Java Core
 */

public class JavaCoreMethods {

    /*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – входные параметры этого метода.*/
    public static double evaluatingExpression(double a, double b, double c, double d){
        return d != 0 ? a * (b + (c / d)): 0;
    }

    /*Написать метод, принимающий на вход два числа, и проверяющий что их сумма
   лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;*/
    public static boolean sumLimit10And20(double a, double b){
        double d = a + b;
        return d >= 10 & d <= 20 ? true : false;
    }

    /*Написать метод, которому в качестве параметра передается целое число,
   метод должен напечатать в консоль положительное ли число передали, или отрицательное.
   Ноль считаем положительным числом.*/
    public static void definingNegativeAndPositiveNumber(double a){
        if(a >= 0)
            System.out.println("Число " + a + " положительное.");
        else
            System.out.printf("Число " + a + " отрицательное.");
    }

    /*Написать метод, которому в качестве параметра передается целое число,
     метод должен вернуть true, если число отрицательное;*/
    public static boolean definingNegativeNumber(double a){
        return a < 0 ? true : false;
    }

    /*Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
    public static void outputtingGreetingToConsole(String str){
        System.out.println(String.format("Привет, %s!", str));
    }
}
