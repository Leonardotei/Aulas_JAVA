package fundamentos;

public class PrimeiroPrograma 
{
	
	public static void main(String[] args) 
	{
		int variavel = 2;
		double raio = 3.4;
		final double pi = 3.14159;
		
		System.out.println(variavel+5);
		System.out.println(pi * raio * raio + "m2 - area da circunferencia");
		
		// Uma sentença de código termina com ';'
		System.out.println("Hello World");
		
		/*
		 Linha 1
		 Linha 2
		 Linha 3	
		 */
		
		System.out.println("um programa!"); // Aqui também funciona!
		
		System.out.println(2/7); //Esse dara 0
		System.out.println(2.0/7.0); //Esse dara o resultado correto
		
		//O '/**' é o JAVADOC, que com a utilização do "@" é possivel fazer marcações especificas
		/** 
		 * @author Leonardo
		 * @since JDK1.0
		 */
	}	
}
