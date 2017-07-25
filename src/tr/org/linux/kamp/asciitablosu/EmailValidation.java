package tr.org.linux.kamp.asciitablosu;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String email = "bus@rasdfdgc.m";
		
		System.out.println(emailVerify(email));
	}
	public static boolean emailVerify(String str) {
		
	
				
		 if(str.contains(" ") || !str.contains("@") || 
				 str.startsWith(".") || str.endsWith(".") || 
				 str.startsWith("@") || str.endsWith("@") || 
				/*src.lenght()-src.lastIndexOf("")>=2;*/
				 !(str.lastIndexOf('.') + 2 < str.length()) || str.contains("@.")) {	 
			 return false;
		 }	
		return true;
	}

}
