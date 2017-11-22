package aufgabe5;

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
	public void braue() {
		braueFilterKaffee();
	}
	@Override
	public void fuegeZutatenHinzu() {
		fuegeZuckerUndMilchHinzu();
	}
}