package aufgabe1;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee {

  /**
   * Bereitet einen Kaffee zu.
   */
  public void bereiteZu() {
    kocheWasser();
    braue();
    giesseInTasse();
    fuegeZuckerUndMilchHinzu();
  }

  private void kocheWasser() {
	  System.out.println("Koche Wasser");
  }

  // Weitere Methoden
}
