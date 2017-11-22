package aufgabe5;

public class Getraenkezubereiter {

	public static void main(String[] args) {
		System.out.println("\n Kaffee: ");
		Kaffee kaffee = new Kaffee();
		kaffee.bereiteZu();
		kaffee.trinke();
		System.out.println("\n Tee: ");
		Tee tee = new Tee();
		tee.bereiteZu();
		tee.trinke();
	}

}
