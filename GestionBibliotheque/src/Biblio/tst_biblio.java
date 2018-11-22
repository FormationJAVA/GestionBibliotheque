package Biblio;

public class tst_biblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre l= new Livre ("Titre","nAuteur", "pAuteur");
		Livre l1= new Livre ("itre","nAuteur", "pAuteur");
		Bibliotheque B= new Bibliotheque(50);
		
		B.Ajouter (l);
		B.Ajouter (l1);
		B.Chercher(l);
		
		System.out.println("-_-_-_-_-_-_");
		System.out.println(B);
	}

}
