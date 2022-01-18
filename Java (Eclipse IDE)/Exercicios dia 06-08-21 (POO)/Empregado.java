package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	//cria��o do m�todo especial Construtor
	public Empregado(String n, double s)
	{
		
		this.setNome(n); // chama o m�todo setNome para inserir o parametro do atributo
		this.setSalario(s);
		
		
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
		public void aumentarSalario(double percentual)
		{
			salario *=1 +percentual/100;
		}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a moeda padr�o do pa�s
		nf.setMinimumFractionDigits(2); // Define a quantidade de casas depois da v�rgula 
		String formatoMoeda = nf.format(salario); //Formata a sa�da do sal�rio
		return formatoMoeda;
	}
		
	
	
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Sal�rio: "+this.formatarMoeda());
	}
}
