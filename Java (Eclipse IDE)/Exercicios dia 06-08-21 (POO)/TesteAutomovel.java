package POO;

public class TesteAutomovel 

{

	public static void main(String[] args) 
	{
	//instanciando um objeto da classe Automovel
		
		Automovel terrivel = new Automovel("Alyson Rodrigo","Porsche","GNB-1404",2021);
		
		
		//troca de mensagens
		
		
		terrivel.imprimirinfo();
		System.out.println("\n\n\n*** Tranfer�ncia de propriet�rio ***\n\n\n");
		
		terrivel.setNomeProprietario("B�rbara Cristiane");
		terrivel.imprimirinfo();
		
		Automovel valente = new Automovel("Diego Silva","Audi","BDS-2612",2021);
		
		
		valente.imprimirinfo();
		terrivel.setPlaca("BDS2G12");
		valente.imprimirinfo();
		
		
		
	}
	
}
