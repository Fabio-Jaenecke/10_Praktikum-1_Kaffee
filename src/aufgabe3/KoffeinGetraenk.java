package aufgabe3;

import java.util.Stack;

public class KoffeinGetraenk {
	private Stack<Integer> zucker;
	private Stack<Integer> milch;
	private static int zitronen = 0;
	public KoffeinGetraenk() {
	
	}
	
	public void kocheWasser() {
	  	System.out.println("Koche Wasser");
	}
	public void braueFilterKaffee(){
    	System.out.println("...brauen...");
    }
    
    public void giesseInTasse() {
    	System.out.println("eingiessen...");
    }
    
    public void fuegeZuckerUndMilchHinzu() {
    	zucker = new Stack<Integer>();
    	milch = new Stack<Integer>();
    	zucker.push(1);
    	milch.push(2); 
    	for (Integer zuck : zucker) {
    		System.out.println("Zuckerstücke: " + zuck);
    	}
        for (Integer milc : milch) {
        	System.out.println("Milch in dl: " + milc);	
    	}
    }
    public void taucheTeebeutel(){
  	  System.out.println("Teabagging...");
    }

    public void fuegeZitroneHinzu(){
  	  ++zitronen;
  	  System.out.println("Anzahl Zironen: " + zitronen);
    }
}
	

