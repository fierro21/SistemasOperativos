package pc.hilo;

import pc.inter.Buffer;

public class Consumidor extends Thread {
	pc.inter.Buffer b;
	
	public Consumidor(Buffer b){
		this.b=b;
	}
	public void run(){
		while(true){
			System.out.println(b.getValor());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
