/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {1, -2, 13, 5, 1};
        
        boolean res = false;
        

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 5) {
                res = true;
                break;
            }
        }

        String ress = "нет";
        if (res) ress = "да";
        System.out.println(ress);

    }
}
