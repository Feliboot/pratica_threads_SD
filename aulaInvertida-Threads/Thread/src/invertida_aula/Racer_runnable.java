package invertida_aula;

public class Racer_runnable implements Runnable{
	private String nome_thread;

	/**
	 * @param args
	 */
	public Racer_runnable(String nome) {
		this.nome_thread=nome;
		
		// TODO Auto-generated constructor stub
	}
	public void run() {
		//System.out.println("Correndo!!!");
		for (int i =0;i<1000;i++){
			System.out.println(nome_thread+" esta correndo!");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
