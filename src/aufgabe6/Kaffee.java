package aufgabe6;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee extends KoffeinGetraenk {
	
  /**
   * Bereitet einen Kaffee zu.
   */
	@Override
	public void verarbeite() {
		braue();
	}
	@Override
	public void fuegeHinzu(int anzahl, int anzahl2) {
		fuegeZuckerUndMilchHinzu(anzahl, anzahl2);
	}
}