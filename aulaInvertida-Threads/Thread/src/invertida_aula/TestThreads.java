package invertida_aula;

public class TestThreads {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Racer rc1 = new Racer("Corredor 1");
		Racer rc2 = new Racer("Corredor 2");
		Racer rc3 = new Racer("Corredor 3");
		Racer rc4 = new Racer("Corredor 4");
		Racer rc5 = new Racer("Corredor 5");
		Racer rc6 = new Racer("Corredor 6");
		Racer rc7 = new Racer("Corredor 7");
		Racer rc8 = new Racer("Corredor 8");
		Racer rc9 = new Racer("Corredor 9");
		Racer rc10 = new Racer("Corredor 10");
		
		rc1.start();
		rc1.join();
		rc2.start();
		rc3.start();
		rc3.join();
		rc4.start();
		rc5.start();
		rc5.join();
		rc6.start();
		rc7.start();
		rc7.join();
		rc8.start();
		rc9.start();
		rc9.join();
		rc10.start();
		
//		Thread t1 = new Thread(new Racer_runnable("corredor 1")); 
//		Thread t2 = new Thread (new Racer_runnable("corredor 2"));
//		//DUAS MANEIRAS DIFERENTES!!!!!!!!
//		
//		
//		
//		Racer_runnable test3 = new Racer_runnable("corredor 3");
//		Racer_runnable test4 = new Racer_runnable("corredor 4");
//		
//		Racer_runnable test5 = new Racer_runnable("corredor 5");
//		Racer_runnable test6 = new Racer_runnable("corredor 6");
//		
//		Racer_runnable test7 = new Racer_runnable("corredor 7");
//		Racer_runnable test8 = new Racer_runnable("corredor 8");
//		
//		Racer_runnable test9 = new Racer_runnable("corredor 9");
//		Racer_runnable test10 = new Racer_runnable("corredor 10");
//		Thread t3 = new Thread(test3);
//		Thread t4 = new Thread(test4);
//		Thread t5 = new Thread(test5);
//		Thread t6 = new Thread(test6);
//		Thread t7 = new Thread(test7);
//		Thread t8 = new Thread(test8);
//		Thread t9 = new Thread(test9);
//		Thread t10 = new Thread(test10);
//
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		t10.start();		
	}

}
