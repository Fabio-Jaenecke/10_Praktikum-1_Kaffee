package aufgabe3;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee extends KoffeinGetraenk {
	
  /**
   * Bereitet einen Tee zu.
   */
  public void bereiteZu() {
	    kocheWasser();
	    giesseInTasse();
	    taucheTeebeutel();
	    fuegeZitroneHinzu();
	    }
 }
