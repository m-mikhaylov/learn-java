/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float m = scan.nextFloat();

        System.out.print("Введите процент: ");
        float p = scan.nextFloat();
        
        float res = m;
        for (int i = 1; i <= 5; i++) {
            res *= 1 + p / 100;
            System.out.println(i + "-й год: " + res);
        }

    }
}
