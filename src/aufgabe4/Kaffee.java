package aufgabe4;

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
	public void braue() {
		braueFilterKaffee();
	}
	public void fuegeZutatenHinzu() {
		fuegeZuckerUndMilchHinzu();
	}
}