package fundamentos;

public class Inferencia 
{
	public static void main(String[] args) 
	{
		double a = 4.5; //vari�vel declarada e inicializada
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);				
				
		c = "Outro texto";
		System.out.println(c);		
		
		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d); // usada!
	}
}
