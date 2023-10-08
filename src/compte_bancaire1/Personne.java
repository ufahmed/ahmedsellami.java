package compte_bancaire1;

public class Personne {
	private String nom;
	private String prenom;
	private String adress;
	
	
	String getnom(){
		return nom;
	}
	
	String getprenom(){
		return prenom;
		
	}
	String getadress(){
		return adress;
	}
	
	void setnom(String s) {
		this.nom=s;
	}
	Personne(String nom,String prenom ,String addresse)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.adress=addresse;
	}
	
	public String toString()
	{
		return "nom: "+nom+" prenom: "+prenom+" adresse: "+adress  ;
	}
	

	
	
}



