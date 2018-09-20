package invertida_aula;

public class Racer extends Thread{
	private String racer_name;
	
	public Racer(String racer_name) {
		super();
		this.racer_name=racer_name;
	}
	
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(racer_name+" Esta correndo");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
