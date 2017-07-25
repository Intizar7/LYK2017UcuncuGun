package tr.org.linux.kamp.asciitablosu;

public class Strings {
	
	public static void main(String[] args) {
		
		// hata alacaksınız -->'a'-->sayi girdiğinde
		String str="hello, World";
		
		//10 dan sonra büyük sayılarda hata veriyor
		//System.out.println(str.charAt(10));
		//her object de toString methodu verilmeli...
		//Arrayin toString methodu yok
		//  conket methodu çağililır
		
		//str.equals();
		
		//burada false çikiyor
		/*String a=new String("hello");
		String b=new String("hello");
		System.out.println(a==b);*/
		//System.out.println(str.substring(0,11));
		//System.out.println(str.indexOf(-1));
		//System.out.println(str.substring(str.indexOf("")+1,str.length());

		//System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.substring(0,2)=="he");
		System.out.println(str.substring(0,2).equals("he"));
	}
}
