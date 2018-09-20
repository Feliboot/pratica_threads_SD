package invertida_aula;

public class Consumidor extends Thread{
	Deposito dep;
	int sleep;
	public Consumidor(Deposito dep, int sleep) {
		super();
		this.dep = dep;
		this.sleep = sleep;
	}
	public  void  run(){
		// TODO Auto-generated method stub
		for (int i =0; i<20;i++) {
			dep.retirar();
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumir terminou de consumir, qtd de itens: " +dep.getNumItens());
	}
}
