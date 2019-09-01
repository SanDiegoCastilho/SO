public class Transferencia extends Thread{
	double valor;
	ContaBancaria contaOrigem;
	ContaBancaria contaDestino;

	public Transferencia(ContaBancaria contaOrigem, double valor, ContaBancaria contaDestino){
		this.valor = valor;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
	}

	public synchronized void run(){
		if (this.contaOrigem.getSaldo() >= this.valor) {
			this.contaDestino.setSaldo(this.valor);
			this.contaOrigem.getValor(this.valor);	

			System.out.println("Transferencia da conta " + this.contaOrigem.nome + " para " + this.contaDestino.nome + " Realizada com sucesso");
			System.out.println("Valor Tranferido: " + this.valor);
			System.out.println();


		}else{
			System.out.println("Saldo insulficiente para transferencia na conta "+ this.contaOrigem.nome);
			System.out.println();

		}
		
	}
}