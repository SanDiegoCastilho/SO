public class Corredor extends Thread{
	String nome;
	int trajeto;
	int descanco;

	public Corredor(String nome, int t, int d){
		this.nome = nome;
		this.trajeto = t;
		this.descanco = d;
	}

	public void run(){
		for (int i = this.trajeto; i > 0; i--) {
			System.out.println("Faltam " + i + " metros para o corredor " + nome);

			if (i == trajeto / 2) {
				System.out.println(nome + " está descansando!");

				try{
								
					Thread.sleep(descanco * 1000);

				}catch(Exception e){

				}
			}
		}

		System.out.println(nome + " Chegou!!!!!");

	}
}