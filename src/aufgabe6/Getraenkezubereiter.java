package aufgabe6;

/**
 * Ein Getänkezubereiter zum vorbereiten von Flüssigkeiten.
 * Hier werden Getränke und Kraftstoffe initialiert.
 * 
 * Tutorial:
 * 
 * 1. Print Statement für den Titel
 * 2. Neues Getränk/Kraftstoff-Objekt erstellen (Kaffee, Tee, Benzin oder Diesel).
 * 3. methode bereiteZu hinzufügen. 
 * 		Parameter: 			(int, int)
 * 		Kaffee     		--> Anzahl Zuckerstücke und Milch in Deziliter
 * 		Tee 			--> Anzahl Zitronen und Anzahl Zuckerstücke
 *      Benzin,Diesel	--> Anzahl  vorne und Anzahl Sitzplätze hinten eines Autos
 * 4. trinke hinzufügen.
 * 
 * @author fabio jaenecke
 *
 */
public class Getraenkezubereiter {

	public static void main(String[] args) {
		
		System.out.println("\nKaffee: ");
		Kaffee kaffee = new Kaffee();
		kaffee.bereiteZu(2, 3);
		kaffee.trinke();
		
		System.out.println("\nTee: ");
		Tee tee = new Tee();
		tee.bereiteZu(1, 2);
		tee.trinke();
		
		System.out.println("\nDiesel: ");
		Diesel diesel = new Diesel();
		diesel.bereiteZu(2, 3);
		diesel.trinke();
		
		System.out.println("\nBenzin: ");
		Benzin benzin = new Benzin();
		benzin.bereiteZu(1, 2);
		benzin.trinke();
	}

}
