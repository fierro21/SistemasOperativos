
package pc.hilo;

import java.util.Random;

import pc.inter.Buffer;

public class Productor extends Thread {
	Buffer b;
	public Productor(Buffer b) {
		this.b = b;
	}
	@Override
	public void run() {
		while(true) {
			Random r = new Random();
			b.setValor(r.nextInt(10)+1);
		}
	}
}