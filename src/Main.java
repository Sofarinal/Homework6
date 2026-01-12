//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1

        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }

        // Задание 2

        for (int i = 10; i > 0; i--) {
            System.out.println("Интерация цикла " + i);
        }

        // Задание 3

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Интерация цикла " + i);
        }

        // Задание 4

        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }

        // Задание 5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задание 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Последовательность " + i);
        }

        // Задание 7


        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность " + i);
        }

        // Задание 8

        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

        // Задание 9

        int moneyMoney = 290000;
        int totalTotal = 0;
        for (int i = 0; i < 12; i++) {
            totalTotal = totalTotal + totalTotal / 100;
            totalTotal = totalTotal + moneyMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTotal + " рублей");
        }
        System.out.println(totalTotal);

        // Задание 10

        for (int i = 1; i <= 10; i++) {
            int resilt = 2 * i;
            System.out.println("2 * " + i + " = " + resilt);
        }
    }
}