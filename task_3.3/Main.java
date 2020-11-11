/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(ifSumMore10(1, -3));
        System.out.println(ifSumMore10(19, 19));
    }
    
    public static boolean ifSumMore10(int n1, int n2) {
        return n1 == n2;
    }
}

