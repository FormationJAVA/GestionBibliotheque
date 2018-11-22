package Biblio;

public class Bibliotheque {
	public Livre[] livre;
	public int nbreLivre;
	public static int nbreMax=500;
	public Bibliotheque ()
	{
		this.nbreLivre=0;
		this.livre = new Livre [this.nbreMax];
	}
	public Bibliotheque (int nMax)
	{
		this.nbreLivre=0;
		this.nbreMax = nMax;
		this.livre = new Livre [this.nbreMax];
	}
	public void Ajouter (Livre L)
	{
		livre[this.nbreLivre] = L;
		this.nbreLivre++;
	}
	
	public boolean Chercher (Livre l)
	{
		for (int i =0; i<this.nbreLivre;++i)
		{
			if (this.livre[i].egal(l))
			{
				System.out.println("Livre existe dans la bibliothèque");
				return true;
			}
			
		}
		System.out.println("Livre n'existe pas dans la bibliothèque");
		return false;
	}
	
	public String toString()
	{
		String message =  "Bibliothèque\n";
		message += "Capacité maximale : "+ this.nbreMax + "\n";
		message += "Nbre de livres : "+ this.nbreLivre + "\n";
		message += "Liste des livres\n";
		for (int i=0; i< this.nbreLivre; ++i)
		{
			message += this.livre[i]+"\n";
		}
		return message;
	}

}
