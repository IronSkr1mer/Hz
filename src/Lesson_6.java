//Создаем класс Lesson_6
public class Lesson_6 {
    //создаем метод main
    public static void main(String[]args){
        //команда щоб вивести текст в консоль
        System.out.println("Числа в діапазоні від 0 до 10:");
        //цикл for
        for(int i = 0; i <= 10; i++){
            //вывод чисел от 1 до 10
            System.out.println(i);
        }
        //иницилизация методов
        second(args);
        third(args);
        fourth(args);
    }
    //создаем второй метод
    public static void second(String[]args){
        //команда на вывод текста в консоль
        System.out.println("Парні числа в діапазоні від 0 до 100:");
        //цикл for
        for (int i = 0; i <= 100; i++) {
            //если остаток от деления і на 2 равняется 0 то
            if (i % 2 == 0) {
                //то выводится і
                System.out.println(i);
            }
        }
    }
    //создаем третий метод
    public static void third(String[]args){
        //создаем переменные
        int a = 7;
        int factorial = 1;
        //цикл for
        for(int i = 1; i <= a; i++) {
            //факториал будет умножатся на і, пока не дойдет до числа а
            factorial *= i;

        }
        //выводит факториал
        System.out.println("Факториал числа " + a + " является число " + factorial);
    }

    //создаем четвёртый метод
    public static void fourth(String[]args){

        System.out.println("Числа Фибаначчи до 100");
        //создаем переменные которые пригодятся чтобы найти число фибаначчи
        int n1 = 0;
        int n2 = 1;
        int sum;

        System.out.println(n1);  // Выводим первое число Фибоначчи (0)

        while (n2 <= 100) {
            System.out.println(n2);  // Выводим текущее число Фибоначчи

            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

}

