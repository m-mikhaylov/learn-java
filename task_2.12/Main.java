/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

	public static void main(String[] args) {
	    
	    int[] nums = {2, 4, 4, 4, 8, 8, 4, 12, 12, 14};

		System.out.println(getMaxSeries(nums));
	}
	
	public static int getMaxSeries(int[] nums)
	{
	    if (nums.length == 0) return 0;
	    
	    int res = 0;
	    int current = nums[0];
	    int currentSeries = 1;
	    
	    for (int i = 1; i < nums.length; i++) {
	        if (nums[i] == current){
	            currentSeries++;
	        }
	        else {
	            if (currentSeries > res) res = currentSeries;
	            current = nums[i];
	            currentSeries = 1;
	        }
	    }
	    return res;
	    
	}

}
