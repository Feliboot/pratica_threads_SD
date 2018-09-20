package invertida_aula;

public class Produtor extends Thread {
	Deposito dep;
	int sleep;

	public Produtor(Deposito dep, int sleep) {
		super();
		this.dep = dep;
		this.sleep = sleep;
	}	
	public synchronized void run(){
		for (int i =0; i<100;i++) {
				dep.colocar();
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println("Produtor terminou de produzir, qtd de itens: " +dep.getNumItens());
	}
}
