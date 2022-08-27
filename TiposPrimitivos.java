package fundamentos;
//Para auxilio no estudo, ultilizar anotações do arquivo TiposPrimitivos.txt
public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		//Os '_' ultilizados nos valores servem apenas para MELHOR LEITURA, não influenciam no valor
		//Informações do funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipos caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//ID associado ao sálario
		System.out.println(id + ": ganha -> " + salario);
		
		//Situação das férias
		System.out.println("Férias? " + estaDeFerias);
		
		//Status
		System.out.println("Status: " + status);		
	}
}
