package Biblio;

public class Livre {
	
	public String titre;
	public Auteur auteur;
	public boolean etat;
	
	public Livre()
	{
		this.titre = "Titre";
		this.auteur = new Auteur("inconnu", "inconnu");
		this.etat =false;
	}
	public Livre(String t, Auteur a, boolean e)
	{
		this.titre = t;
		this.auteur = a;
		this.etat =e;
	}
	public Livre(String t, Auteur a)
	{
		this.titre = t;
		this.auteur = a;
		this.etat =true;
	}
	public Livre(String t, String n, String p)
	{
		this.titre = t;
		this.auteur = new Auteur (n,p);
		this.etat =true;
	}
	
	public boolean egal(Livre L)
	{
		if (this.auteur.egal(L.auteur) &&
			this.titre.equals(L.titre))
			return true;
		return false;
	}
	public String toString()
	{
		String message="";
		
		message+=""+this.titre+", ";
		message+=this.auteur.toString()+", ";
		message+=""+
		(this.etat ? "Dispo" : "Prêté\n");
		return message;

	}
}
