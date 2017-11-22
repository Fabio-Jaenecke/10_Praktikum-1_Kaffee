package aufgabe6;

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
	@Override
	public void verarbeite() {
		taucheTeebeutel();
    } 
	@Override
	public void fuegeZutatenHinzu(int anzahl1, int anzahl2) {;
		fuegeZitroneHinzu(anzahl1, anzahl2);
	}
}

