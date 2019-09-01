public class Deposito extends Thread{
	double valor;
	ContaBancaria conta;

	public Deposito(ContaBancaria conta, double valor){
		this.valor = valor;
		this.conta = conta;
	}

	public synchronized void run (){
		this.conta.setSaldo(this.valor);

		System.out.println("Depósito na conta " + this.conta.nome + " um valor de: R$ " + this.valor);
		System.out.println();

	}
}