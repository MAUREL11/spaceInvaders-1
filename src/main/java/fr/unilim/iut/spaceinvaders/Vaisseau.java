package fr.unilim.iut.spaceinvaders;

public class Vaisseau {
	
	private int x;
	private int y;
	private int hauteur;
	private int longueur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}
	
	  public Vaisseau(int longueur, int hauteur, int x, int y) {
		   this.longueur=longueur;
		   this.hauteur=hauteur;
		   this.x = x;
		   this.y = y;
	  }
	
	public boolean occupeLaPosition(int x, int y) {
		if ((this.x <= x) && (x <= abscisseLaPlusADroite()))
			if ((this.y - this.hauteur + 1 <= y) && (y <= this.y))
				return true;

		return false;
	}

	public int abscisseLaPlusADroite() {
		return this.x + this.longueur - 1;
	}

	public int abscisseLaPlusAGauche() {
		return x;
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x+1;		
	}
	
	public void seDeplacerVersLaGauche() {
		this.x = this.x-1;
	}

	public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
	
	private void test(){
		System.out.println("Github c'est bizzare je peux pas fetch correctement");
	}
}
