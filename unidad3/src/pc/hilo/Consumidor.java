package pc.hilo;

import pc.inter.Buffer;

public class Consumidor extends Thread {
	int fac,x,i;
	Buffer b;
	public Consumidor(Buffer b) {
		// TODO Auto-generated constructor stub
		this.b = b;
	}
	@Override
	public void run() {
		while(true) {
			
			i=b.getValor();		

			fac=1;
            for(x=1; x<=i; x++)
         
                  fac=x*fac;
            
            if (i==-1) { break;}       
			System.out.println("[Consumidor] El factorial es "+fac);
			 
		}
	}

}
