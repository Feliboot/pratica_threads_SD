package invertida_aula;

public class Deposito {
	private int items = 0;
	private final int capacidade = 10;

	public int getNumItens(){
		return items;
	}

	public synchronized boolean retirar(){
		while(items==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		items=getNumItens() -1;
		notifyAll();
		return true;
	}    

	public synchronized boolean colocar() {
		while(items==capacidade) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		items=getNumItens() +1;
		return true;
	}

	public static void main(String[] args) {
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep, 50);
		Consumidor c1 = new Consumidor(dep, 150);
		Consumidor c2 = new Consumidor(dep, 100);
		Consumidor c3 = new Consumidor(dep, 150);
		Consumidor c4 = new Consumidor(dep, 100);
		Consumidor c5 = new Consumidor(dep, 150);

		//Startar o produtor
		//...



		//Startar o consumidor
		//...
		p.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		//c6.start();
		System.out.println("Execucao do main da classe Deposito terminada");
	}
	
}
