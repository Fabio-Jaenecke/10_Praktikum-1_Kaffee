package aufgabe6;

import java.util.Stack;

/**
 * Hier werden KoffeinGetraenke definiert
 * 
 * @author fabio jaenecke
 *
 */
public abstract class KoffeinGetraenk implements Trinkbar {
	private Stack<Integer> zucker;
	private Stack<Integer> milch;
	
	public final void bereiteZu(int anzahl, int anzahl2) { 
		hole(); 
	    verarbeite(); 
	    giesse(); 
	    fuegeHinzu(anzahl, anzahl2);
	  } 
	
	public void hole() {
		kocheWasser();
	}
	public void verarbeite() {
		//will be overwritten
	}
	public void giesse() {
		giesseInTasse();
	}
	public void fuegeHinzu(int anzahl, int anzahl2) {
		fuegeZutatenHinzu(anzahl, anzahl2);
	}
	
	
	
	public void fuegeZutatenHinzu(int anzahl, int anzahl2) {
		//will be overwritten
	}
	public void kocheWasser() {
	  	System.out.println("Koche Wasser...");
	}
	public void braue(){
    	System.out.println("brauen...");
    }
	public void taucheTeebeutel(){
	  	  System.out.println("Teabagging...");
	}    
    public void giesseInTasse() {
    	System.out.println("eingiessen...");
    }
    public void fuegeZuckerUndMilchHinzu(int anzahl, int anzahl2) {
    	zucker = new Stack<Integer>();
    	milch = new Stack<Integer>();
    	zucker.push(anzahl);
    	milch.push(anzahl2); 
    	for (Integer zuck : zucker) {
    		System.out.println("Zuckerstücke: " + zuck);
    	}
        for (Integer milc : milch) {
        	System.out.println("Milch in dl: " + milc);	
    	}
    }
    public void fuegeZitroneHinzu(int anzahl, int anzahl2){
  	  System.out.println("Anzahl Zironen: " + anzahl);
  	  System.out.println("Anzahl Zuckerstücke: " + anzahl2);
    }
    public void trinke() {
    	 System.out.println("Ich trinke einen " + getClass().getSimpleName());
    }
    
}
	

