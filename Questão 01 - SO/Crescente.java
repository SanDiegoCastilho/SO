public class Crescente implements Runnable{
	int contador;
	String nome;

	public Crescente(String nome){
		this.nome = nome;
	}

	public void run(){
		for (int i = 1; i <= 100; i++) {
			System.out.println(nome + ": " + i);
		}
	}
}