package j1_lesson_home1;

/**
 * Домашняя работа №1
 * Переменные, примитивы, условия, методы
 * Сандаков Константин Александрович
 * Создан: 2022.04.23
 */

public class Main {

    /*
    * Написать метод вычисляющий выражение а * (b + (c / d) и возвращающий результат с плавающей точкой,
    * где a, b, c, d - целочисленные входные параметры этого метода.
    */
    private static float calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    /*
    * Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
    * от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.
    */

    private static boolean checkTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >= 10;
    }

    /*
    * Написать метод, которому в качестве параметра передается целое число, метод должен проверить
    * положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    * Результат работы метода вывести в консоль.
    */

    private static boolean isPositive(int a) {
        return a >= 0;
    }

    /*
    * Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
    * вернуть приветственное сообщение "Привет, переданное_имя!". Вывести приветствие в консоль.
    */

    private static String welcome(String name) {
        System.out.println("Привет " + name);
        return "Привет " + name;
    }

    /*
    * Написать метод, который определяет является ли год високосным.
    * Каждый 4-й год является високосным, кроме каждого 100-го,
    * при этом каждый 400-й високосный.
    * Для проверки работы вывести результаты работы метода в консоль.
    */

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0);
    }

    public static void main(String[] args) {

        System.out.println("Ваш результат " + calculate(1, 2, 3, 4));

        System.out.println(checkTwoNumbers(1, 5));

        boolean result = isPositive(-2);
        if (result) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        
        System.out.println(welcome("Ivan"));

        System.out.println("Високосный ли год? " + isLeapYear(2022));
    }

}
