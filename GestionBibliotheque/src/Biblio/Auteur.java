package Biblio;

public class Auteur {
	
	public String Nom;
	public String Prenom;
	
	public Auteur(String n, String p)
	
	{
		this.Nom = n;
		this.Prenom = p;
	}
	
	public boolean egal(Auteur A)
	{
		if (this.Nom.equals(A.Nom) &&
			this.Prenom.equals(A.Prenom))
			return true;
		
		return false;
	}

	public String toString()
	{
		String message="";
		message+=""+this.Prenom+", ";
		message+=""+this.Nom+"";
		
		return message;
	}
}
