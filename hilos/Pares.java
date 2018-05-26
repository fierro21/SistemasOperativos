package hilos;

public class Pares extends Thread {

	  
    public static class par extends Thread {

		private int n;
		public static final int OPERACION_IMPAR =1;
		private int op;
		
		public par (int n, int op) {
			this.n=n;
			this.op = op;
		}
		
		public void run() {
			switch (op) {
			case OPERACION_IMPAR:
				
				if(par(n)) {
					
				System.out.println(" es par ");	
				
				}
				else {
					
					System.out.println(" es impar ");
				}
				break;

			default:
				break;
			}
			
			}
		private boolean par(int n) {
			return (n%2==0);
		 }
	 }

public  static class Suma extends Thread {
	private int n;
	public static final int OPERACION_SUMA =1;
	private int op;
	int num = 5;
	int sum = 0;
	int cont = num;
	
	public Suma (int n, int op) {
		this.n=n;
		this.op = op;
	}
	
	public void run() {
		switch (op) {
		case OPERACION_SUMA:
			
			while (n != 0) {
				 
				  sum = sum + n;
				  n--;
				}
			System.out.println("la sumatoria es "+ sum);
			break;

		default:
			break;
		}
		
		}
	private int Suma(int sum) {
		return (sum);
	}
	}

public static class Factorial extends Thread {
	private int n;
	public static final int OPERACION_FACTORIAL =1;
	private int op;
	private int total;
	public Factorial (int n, int op) {
		this.n=n;
		
		
		this.op = op;
	}
	
	public void run() {
		switch (op) {
		case OPERACION_FACTORIAL:
			
			int total = 1; 
			for (int i=1; i<=n; i++) {
				total = total * i; 
				
				
			}
                        System.out.println("el factorial es "+total);
                        
			break;

		default:
			break;
		}
		
		}
	private int Factorial(int total) {
		return (total);
	}

}

public  static class Primo extends Thread {

		private int n;
		public static final int OPERACION_PRIMO =1;
		private int op;
		
		public Primo (int n, int op) {
			this.n=n;
			this.op = op;
		}
		
		public void run() {
			switch (op) {
			case OPERACION_PRIMO:
				 int cont;
				 cont=0;
				for (int x = 1; x < n; x++) {
	                if((n%x)==0){
	                	cont++;
	                }
				}
	                    if (cont<=2)
	                    {
	                    	System.out.println("es primo ");
	                    }
	                    else {
	                    	System.out.println("no es primo ");
	                    	}
	                    
	                    	
	                    }
				

			
				
			}
		}

	
public static class Fibonnaci extends Thread {

		private int n;
		public static final int OPERACION_FIBONNACI =1;
		private int op;
		
		public Fibonnaci(int n, int op) {
			this.n=n;
			this.op = op;
		
		}
		
		public void run() {
			switch (op) {
			case OPERACION_FIBONNACI:
				
				   int fibo1,fibo2,i;
				   if(n<=1){
			            System.out.print("Introduce numero mayor que 1 para n'esimo termino: \n");
			        }
				    
				    fibo1=1;
			        fibo2=1; 

			        
			        for(i=2;i<=n;i++){
			             
			             fibo2 = fibo1 + fibo2;
			             fibo1 = fibo2 - fibo1;
			        }
			        
			        System.out.println(" fibonnaci es "+fibo1+" y "+fibo2);
			        
			       
				break;

			default:
				break;    
			}
				
		} 
		private int Fibonnaci(int fibo1) {
			return fibo1 ;
			
		}
}
}

		

