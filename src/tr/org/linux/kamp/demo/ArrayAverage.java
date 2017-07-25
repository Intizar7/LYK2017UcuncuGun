package tr.org.linux.kamp.demo;
import java.util.Arrays;

public class ArrayAverage {

	static int minCounter = 1;
	static int maxCounter = 1;

	public static void main(String[] args) {
		int[] integerArray = { 5, 7, 3, 4, 9, 2, 14, 15, 15, 1, 1, 15 };

		System.out.println(Arrays.toString(integerArray));
		int max = max(integerArray);
		int min = min(integerArray);
		int sum = sum(integerArray);
		sum = sum - min - max;
		int average = (sum / (integerArray.length - (minCounter + maxCounter)));
		System.out.println("minCounter= " + minCounter);
		System.out.println("maxCounter= " + maxCounter);
		System.out.println("sum= " + sum);
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		System.out.println("average= " + average);
		
	}

	public static int[] sort(int[] paramArray) {
		Arrays.sort(paramArray);
		return paramArray;

	}

	public static int max(int[] paramArray) {
		sort(paramArray);
		int max = paramArray[paramArray.length - 1];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] == max) {
				maxCounter++;
			}
		}
		return max;
	}

	public static int min(int[] paramArray) {
		sort(paramArray);
		int min = paramArray[0];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] == min) {
				minCounter++;
			}
		}
		return min;
	}

	public static int sum(int[] paramArray) {
		int sum = 0;
		for (int i = 1; i < paramArray.length; i++) {
			sum += paramArray[i];
		}

		return sum;
	}

}
