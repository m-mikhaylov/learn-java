/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        System.out.println(num * 115 / 100);
    }
}
