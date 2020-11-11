/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {1, -2, 13, 13, 1};
        
        boolean res = false;
        
        if (nums.length > 0) {
    
            int prev = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == prev) {
                    res = true;
                    break;
                }
                prev = nums[i];
            }
        }
        
        String ress = "нет";
        if (res) ress = "да";
        System.out.println(ress);

    }
}
