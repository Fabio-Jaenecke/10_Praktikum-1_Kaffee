package aufgabe5;
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
	public void braue() {
		taucheTeebeutel();
    } 
	@Override
	public void fuegeZutatenHinzu() {;
		fuegeZitroneHinzu();
	}
}

