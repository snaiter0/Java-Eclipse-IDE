package POO;

import java.util.Scanner;

public class Eletr�nico 
{
	
	private String nome; 
	private String TensaoIn;
	private String TensaoOut;
	private String CorrenteOut;
	private String Potencia;
	Scanner Leia = new Scanner(System.in);
	
	
	public Eletr�nico(String N,String Tin,String Tout,String IO,String P)
	{
		
		
		System.out.println("Nome do eletr�nico: ");
		this.setNome(Leia.nextLine());
		System.out.println("Tens�o de entrada do eletr�nico: ");
		this.setTensaoIn(Leia.nextLine());
		System.out.println("Tens�o de sa�da do eletr�nico: ");
		this.setTensaoOut(Leia.nextLine());
		System.out.println("Corrente de sa�da do eletr�nico: ");
		this.setCorrenteOut(Leia.nextLine());
		System.out.println("A potencia do eletr�nico: ");
		this.setPotencia(Leia.nextLine());
		
		
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTensaoIn() {
		return TensaoIn;
	}
	public void setTensaoIn(String tensaoIn) {
		TensaoIn = tensaoIn;
	}
	public String getTensaoOut() {
		return TensaoOut;
	}
	public void setTensaoOut(String tensaoOut) {
		TensaoOut = tensaoOut;
	}
	public String getCorrenteOut() {
		return CorrenteOut;
	}
	public void setCorrenteOut(String correnteOut) {
		CorrenteOut = correnteOut;
	}
	public String getPotencia() {
		return Potencia;
	}
	public void setPotencia(String potencia) {
		Potencia = potencia;
	}
	
	
	public void ImprimirInforma��es()
	{
		System.out.println("\t\t"+nome+"\nA Tens�o de entrada � de: "+TensaoIn+".\nA de sa�de da fonte �: "+TensaoOut+".\nA corrente de sa�da � de: "+CorrenteOut+".\nA potencia do eletr�nico � de: "+Potencia+".");
	}
}
