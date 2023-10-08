package compte_bancaire1;

public class testcompte {
	public static void main(String[] args) 
	{
		Personne P1=new Personne("ahmed","sellami","ben arous");
		Personne P2=new Personne("aziz ","belhadj","nabeul");
		Compte_Bancaire []t =new Compte_Bancaire[2];
		t[0]=new Compte_Bancaire(P1,3500,800,1000);
		t[1]=new Compte_Bancaire(P2,2000,800,1000);
		
		Compte_Bancaire.Virement(t[0],t[1], 3000);
		System.out.println(t[0].getsolde());
		System.out.println(t[1].getsolde());
		double max=t[0].getsolde();
		int y=0;
		for(int i=1;i<t.length;i++)
		{
			if(t[i].getsolde()>max)
			{
				max=t[i].getsolde();
				y=i;
				
			}
		}
		System.out.println(t[y]);
	}
	
	
	
	
	
	
	
	
	
}
