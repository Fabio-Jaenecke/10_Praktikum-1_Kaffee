package aufgabe1;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee {

  /**
   * Bereitet einen Tee zu.
   */
  public void bereiteZu() {
    kocheWasser();
    taucheTeebeutel();
    giesseInTasse();
    fuegeZitroneHinzu();
  }

  private void kocheWasser() {
	    System.out.println("Koche Wasser");
	  }
}
