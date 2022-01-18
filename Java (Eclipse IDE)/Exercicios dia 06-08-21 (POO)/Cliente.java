package POO;

import java.text.NumberFormat;

public class Cliente 
{

	private String 	nome;
	private String 	perfil;
	private double	saldo;
	
	public Cliente(String j, String e, double s)
	{
		this.setNome(j);
		this.setPerfil(e);
		this.setSaldo(s);
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a moeda padr�o do pa�s
		nf.setMinimumFractionDigits(2); // Define a quantidade de casas depois da v�rgula 
		String formatoMoeda = nf.format(saldo); //Formata a sa�da do sal�rio
		return formatoMoeda;
	}
	public void imprimirInfo()
	
	{
		System.out.println("\t\tInforma��es do cliente: "+nome+"\n");
		System.out.println("Perfil do cliente: "+perfil);
		System.out.println("Saldo do cliente � equivalente a: "+this.formatarMoeda());
		
		
	}
	
	
	
	
	
}
