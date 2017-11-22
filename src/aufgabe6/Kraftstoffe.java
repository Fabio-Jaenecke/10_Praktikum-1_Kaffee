package aufgabe6;

/**
 * Hier werden Kraftstoffe definiert
 * 
 * @author fabio jaenecke
 *
 */
public abstract class Kraftstoffe implements Trinkbar {
	
	public final void bereiteZu(int anzahl, int anzahl2) { 
		    hole(); 
		    verarbeite(); 
		    giesse(); 
		    fuegeHinzu(anzahl, anzahl2);
		  } 
	    
	
	
		public void hole() {
			bohreNachErdoel();
		} 
		public void verarbeite() {
			raffiniertInRaffinerie();
		}
		public void giesse() {
			giesseInAuto();
		}
		public void fuegeHinzu(int anzahl, int anzahl2) {
			fuegePersonenHinzu(anzahl, anzahl2);
		}
		
		
		
		
		public void bohreNachErdoel() {
			System.out.println("Es wird nach " + getClass().getSimpleName() + " gebohrt...");
		}
		public void raffiniertInRaffinerie() {
			System.out.println("raffiniert in der Raffinierie...");
		}
		public void giesseInAuto() {
			System.out.println("Das Auto wird getankt...");
		}
		public void fuegePersonenHinzu(int anzahl, int anzahl2) {
			System.out.println("Es befinden sich " + (anzahl + anzahl2) + " Personen im Auto, " + anzahl + " vorne und " + anzahl2 + " hinten.");
		}

		
	public void trinke() {
		System.out.println("Das Auto schluckt " + getClass().getSimpleName() + ", welches kein Getränk ist.");
	}
}
