package tr.org.linux.kamp.array;

import java.util.Arrays;

public class ArrayTerstenYazdir {
	
	static int[] myArray= {3,5,8,1,9,7,0,6,2,4};
	
	public static void main(String[] args) {
		
		   System.out.print(Arrays.toString(myArray)+"\n");
		   TerstenYazdir();
		   System.out.println(Arrays.toString(myArray));
		   
	}
	public static void TerstenYazdir() {
		
		 for(int i = 0 ; i < myArray.length/2 ; i++)
		/* array.lenght/2 ye bölmemizin sebebi dizi uzunluğunu
		 *  ikiye bölüyor ve ilk eleman son eleman swap işlemi gerçekleştirecez*/
	        {
	            int temp = myArray[i];
	            myArray[i] = myArray[myArray.length-i-1];
	            myArray[myArray.length-i-1]=temp;
	        }  
	}
}
