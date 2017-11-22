package aufgabe6;

/**
 * Das interface definiert die Pflichtfelder für Getränke.
 * 
 * @author fabio jaenecke
 *
 */
public interface Trinkbar {
	
	//zubereiten
	void hole(); 
    void verarbeite(); 
    void giesse(); 
    void fuegeHinzu(int anzahl, int anzahl2);
    
    //trinken
	void trinke();
}
