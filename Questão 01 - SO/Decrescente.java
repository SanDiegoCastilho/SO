public class Decrescente extends Thread{
	int contador;
	String nome;

	public Decrescente(String nome){
		this.nome = nome;
	}

	public void run(){
		for (int i = 100; i > 1; i--) {
			System.out.println(nome + ": " + i);
		}
	}
}