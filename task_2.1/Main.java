/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static String[] mama = {"Мама", "Мыла", "Раму"};
    
    public static void main(String[] args) {
        int[] arr = new int[mama.length];
        Rec(arr);
    }
    
    
    public static void Rec(int[] array) {
        int zidx = zeroIndex(array);
        if (zidx < 0) {
            for (int i = 0; i < array.length; i++)
                System.out.print(mama[array[i]-1]);
            System.out.println();
            return;
        }
        
        for (int i = 1; i <= array.length; i++) {
            if (!hasNum(array, i)) {
                array[zidx] = i;
                Rec(array);
                array[zidx] = 0;
            }
        }
        
    }
    
    public static boolean hasNum(int[] array, int num) {
        for (int i= 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    
    public static int zeroIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return i;
        }
        return -1;
    }
}

