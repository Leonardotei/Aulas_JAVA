package fundamentos;
//Para auxilio no estudo, ultilizar anota��es do arquivo TiposPrimitivos.txt
public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		//Os '_' ultilizados nos valores servem apenas para MELHOR LEITURA, n�o influenciam no valor
		//Informa��es do funcionario
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipos caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//ID associado ao s�lario
		System.out.println(id + ": ganha -> " + salario);
		
		//Situa��o das f�rias
		System.out.println("F�rias? " + estaDeFerias);
		
		//Status
		System.out.println("Status: " + status);		
	}
}
