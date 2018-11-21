public class ArrSum {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5, 7, 8, 9, 9};
		int n=10;
		execute(array,n);
	}

	public static void execute(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			int temp = n - array[i];
			if (temp > array[i]) {
				for(int j = i + 1; j < array.length && array[j] <= temp; j++){
					if(array[j] + array[i] == n)
						System.out.print("(" + array[i] + " " + array[j]+")"+" ");
				}
			}
		}
	}
}
