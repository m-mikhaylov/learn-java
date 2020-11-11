/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


public class Main {
    public static void main(String[] args) {
        System.out.println(ifSumMore10(1, -3));
        System.out.println(ifSumMore10(19, -3));
    }
    
    public static boolean ifSumMore10(int n1, int n2) {
        return n1 + n2 > 10;
    }
}
