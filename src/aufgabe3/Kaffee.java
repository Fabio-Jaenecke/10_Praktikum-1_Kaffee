package aufgabe3;

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
  public void bereiteZu() {
	  kocheWasser();
	  braueFilterKaffee();
	  giesseInTasse();
	  fuegeZuckerUndMilchHinzu();
  }
}