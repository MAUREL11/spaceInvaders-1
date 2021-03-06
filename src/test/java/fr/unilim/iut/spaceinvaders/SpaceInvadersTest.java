package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;

public class SpaceInvadersTest {

	private SpaceInvaders spaceinvaders;

	@Before
	public void initialisation() {
		spaceinvaders = new SpaceInvaders(15, 10);
	}

	// Test de positionnement d'un vaisseau
	@Test
	public void test_AuDebut_JeuSpaceInvaderEstVide() {
		// Assert
		assertEquals("" + "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + "...............\n",
				spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}

	@Test
	public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {

		// Act
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,7, 9);

		// Assert
		assertEquals("" + "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + "...............\n"
				+ "...............\n" + ".......V.......\n",
				spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}

	@Test(expected = HorsEspaceJeuException.class)
	public void test_unNouveauVaisseauEstPositionneHorsEspaceJeuTropADroite_UneExceptionEstLevee()
			throws Exception {
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,15, 9);
	}
	
	// test de déplacement d'un vaisseau
    @Test
	public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);

		spaceinvaders.deplacerVaisseauVersLaDroite();
		
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"........V......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}

    @Test
	public void test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
		
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,9);

		spaceinvaders.deplacerVaisseauVersLaDroite();
		
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"..............V\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
    
    @Test
	public void test_VaisseauAvance_DeplacerVaisseauVersLaGauche() {
		
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);

		spaceinvaders.deplacerVaisseauVersLaGauche();
		
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"......V........\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
    
	@Test
	public void test_VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
		
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,0,9);

		spaceinvaders.deplacerVaisseauVersLaGauche();
		
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"V..............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
    
    @Test
	public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		".......VVV.....\n" + 
		".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
}
