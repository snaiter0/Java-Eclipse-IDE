package Heran�a;
public class ExemploHeran�aPessoa extends ExemploHeran�a

{
private int codigoSetor;
private float salarioBase;
private float imposto;

public ExemploHeran�aPessoa(String nome, String endereco,
String cpf, int telefone, int idade, int
codigoSetor, float salarioBase, float imposto) 

{
super (nome, endereco, cpf, telefone, idade);
this.codigoSetor = codigoSetor;
this.salarioBase = salarioBase;
this.imposto = imposto;
}


public void imprimirInfo() 
{
System.out.println("\nNome do empregado: " +
getNome() + "\nCPF: " + getCpf()
+ "\nIdade: " + getIdade()
+ "\nTelefone: " + getTelefone()
+ "\nEndere�o: " + getEndereco() + "\nC�digo"+
"do setor:"  + codigoSetor + "\nSal�rio base: "
+ salarioBase + "\nValor em porcentagem(sem o"+
"%) de imposto a ser retido do sal�rio:" + imposto);
}

public void calcularSalario() {
double salario_total = salarioBase -
(salarioBase * (imposto/100));
System.out.println("O sal�rio total a ser"+
"recebido pelo empregado: "+ getNome() + " � igual a" 
		+ salario_total);
}
}