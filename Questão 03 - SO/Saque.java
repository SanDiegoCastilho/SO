public class Saque extends Thread{
	double valor;
	ContaBancaria conta;

	public Saque(ContaBancaria conta, double valor){
		this.valor = valor;
		this.conta = conta;
	}
	public synchronized void run (){
		if (this.conta.getSaldo() >= this.valor) {
			this.conta.getValor(valor);

			System.out.println("Saque na conta " + this.conta.nome + " valor: " + this.valor);	
			System.out.println();

		}else{
			System.out.println("Saldo insulficiente na conta " + this.conta.nome);
			System.out.println();

		}
	}	
}