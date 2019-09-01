public class Banco{
	public static void main(String [] args){
		ContaBancaria conta1 = new ContaBancaria("San", 100);
		ContaBancaria conta2 = new ContaBancaria("Samir", 200);
		ContaBancaria conta3 = new ContaBancaria("Igor", 300);

		Deposito deposito1 = new Deposito(conta1, 100);
		Transferencia transferencia1 = new Transferencia(conta1, 200, conta2);
		Saque saque1 = new Saque(conta3, 400);
		Saque saque2 = new Saque(conta2, 50);
		Saque saque3 = new Saque(conta1, 70);

		deposito1.start();
		transferencia1.start();
		saque1.start();
		saque2.start();
		saque3.start();

	}
}