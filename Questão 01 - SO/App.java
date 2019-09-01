public class App{
	public static void main(String [] args){
		Thread t_1 = new Thread(new Crescente("T1")); 
		Thread t_2 = new Thread(new Crescente("T1"));
		Decrescente t_3 = new Decrescente("T3");  
		Decrescente t_4 = new Decrescente("T4");

		t_1.start();
		t_2.start();
		t_3.start();
		t_4.start();

	}
}