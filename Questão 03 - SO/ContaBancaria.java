public class ContaBancaria{
	String nome;
	double saldo;

	public ContaBancaria(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo; 
	}

	public void setSaldo(double valor){
		this.saldo += valor;
	}

	public void getValor(double valor){
		
		if(this.saldo >= valor){
			this.saldo -= valor;

		}else{
			System.out.println("Saldo insulficiente");
		}
	}

	public double getSaldo(){
		return this.saldo;
	}
}