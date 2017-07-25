package tr.org.linux.kamp.asciitablosu;

public class Karakter_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = Integer.toString(1555579256);
		System.out.println(str);
		String hello = "Hello world!";
		System.out.println(hello);
		System.out.println(hello.toUpperCase());
		System.out.println(hello);
		
		String a = "hello";
		String b = "hello";
		boolean karsi = "hello" == "hello" ;
		boolean karsiab = a == b;
		
		System.out.println(karsi);
		System.out.println(karsiab);
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(c==d);
		
		System.out.println(hello.substring(hello.indexOf(' ')+1,hello.length()));
		
		System.out.println(hello.indexOf(' '));
		
		System.out.println(hello.charAt(hello.length()-1));
		
		System.out.println(hello.indexOf('e')); //ilk e nin değerini verir.
		System.out.println(hello.indexOf('l',3));
		
		
		
	}

}


