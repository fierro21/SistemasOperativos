package pc.bean;

import pc.inter.Buffer;

public class Memoria implements Buffer {
	private int n;

	@Override
	public synchronized void setValor(int n) {
		// TODO Auto-generated method stub
		this.n= n;
		notify();
	}

	@Override
	public synchronized int getValor() {
		// TODO Auto-generated method stub
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

}
