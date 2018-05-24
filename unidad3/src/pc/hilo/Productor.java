
package pc.hilo;


import java.util.Scanner;

import pc.inter.Buffer;

public class Productor extends Thread {
	Buffer b;
	int i;
	public Productor(Buffer b) {
		this.b = b;
	}
	@Override
	public void run() {
		
		while(true) {
			System.out.println("[Productor] ingrese un numero: \n");
			Scanner sc = new Scanner(System.in);
			b.setValor(i=sc.nextInt());
			
			if(i==-1) {break;}
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
