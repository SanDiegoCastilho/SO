public class Corrida{
	public static void main(String [] args){
		Corredor c1 = new Corredor("Samito", 90, 2);
		Corredor c2 = new Corredor("Biriguinho", 150, 2);
		Corredor c3 = new Corredor("Baulo", 95, 5);
		Corredor c4 = new Corredor("Lelin", 872, 1);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}