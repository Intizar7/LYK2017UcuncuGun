package tr.org.linux.kamp.asciitablosu;

import java.util.*;
public class ASCITable {
	public static void main(String[] args) {
		/*char a='a';
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('2'));
		*/
		Random rand=new Random();
		
		char a=(char) (rand.nextInt(26)+'A');
				
		System.out.println(a);
	}

}
