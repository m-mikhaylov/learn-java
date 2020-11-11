/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int nums[] = {4,2,6,2,65};
        printArray(nums, 0);
    }
    
    public static void printArray(int[] nums, int index) {
        if (index < nums.length) {
            System.out.println(nums[index]);
            printArray(nums, index + 1);
        }
        
    }
}
