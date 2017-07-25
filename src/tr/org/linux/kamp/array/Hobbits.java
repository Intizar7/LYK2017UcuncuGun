package tr.org.linux.kamp.array;

public class Hobbits {

	String name;

	public static void main(String[] args) {
		
		Hobbits[] hob = new Hobbits[3];

		int z = 0;

		while (z < 3) {
			hob[z] = new Hobbits();
			hob[z].name = "Frado";

			if (z == 1) {
				hob[z].name = "Bilbo";
			}
			if (z == 2) {
				hob[z].name = "Sam";
			}
			System.out.println(hob[z].name + "Mordor'a ilerliyor");
			z = z + 1;
		}
	}
}
