package compte_bancaire1;

public class Compte_Bancaire{
	static int compteur;
	private int num_compte;
	Personne titulaire;
	private double solde;
	private double decouvert_max;
	private double debit_max;
	Compte_Bancaire(Personne p){
		this.titulaire=p;
		this.solde=0;
		this.decouvert_max=800;
		this.debit_max=1000;
		compteur++;
		num_compte=compteur;
	}
	Compte_Bancaire(Personne p ,double solde, double decouvertMax,double debitMax)
	{
		this.titulaire=p;
		this.solde=solde;
		this.decouvert_max=decouvertMax;
		this.debit_max=debitMax;
		compteur++;
		num_compte=compteur;
	}
	double getsolde() {
		return this.solde;
	}
	double getdecouvert_max() {
		return this.decouvert_max;
	}
	double getdebit_max() {
		return this.debit_max;
	}
	void setnumCompte(int d) {
		this.num_compte=d;
	}
	void setsolde(double a) {
		this.solde=a;
	}
	void setdecouvert_max(double b) {
		this.decouvert_max=b;
	}
	void setdebit(double c) {
		this.debit_max=c;
	}
	public String toString() {
		return "compte{"+titulaire +"accountNumber"+ num_compte +",solde"+ solde +
				",decouvert_max"+ decouvert_max +",debit_max"+ debit_max+"}";
	}
	public void crediter(double montant)
	{
		montant=montant+this.solde;
	}
	public void debiter(double montant ) {
		double x; 
		x= montant;
		x=montant-this.solde;
		if(x>this.decouvert_max)
		{
			x=solde;
		}
		else {
			System.out.println("erreur");
		}
		
		
	}
	public boolean retrait(double montant) {
		if(montant>debit_max)
		{
			System.out.println("erreur");
			return false;
		}
		else
		{
			this.debiter(montant);
			return true;
		}
	}
	public boolean estadecouvert() {
		if (this.solde>0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
	}
	
	public double montantDecouvert() {
		if(estadecouvert()==true) {
			return -solde;
			
		}
		else {
			return 0;
		}
		
		
	}
	
	public void Virement(Compte_Bancaire C1, double montant)
	{
		if(this.retrait(montant)==true)
		{
			C1.crediter(montant);
		}
		else
		{
			System.out.println("impossible de virement");
		}
	}
	
	public static void Virement(Compte_Bancaire C1,Compte_Bancaire C2, double montant)
	{
		if(C1.retrait(montant)==true)
		{
			C2.crediter(montant);
		}
		else
		{
			System.out.println("impossible de virement");
		}
	}
	
}
	
	
	


