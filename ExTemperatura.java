package fundamentos;

public class Temperatura 
{	
	public static void main(String[] args) 
	{
		//F�rmula: (�F - 32) x 5/9 = �C
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		int fahrenheint = 86;
		
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		
		System.out.println("O resultado � " + celsius + "�C.");
		
		fahrenheint = 140;
		celsius = (fahrenheint - AJUSTE) * FATOR;
		
		System.out.println("O resultado � " + celsius + "�C." );	
	}		
}